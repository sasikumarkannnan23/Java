package com.dal.patienttreatment.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.dal.patienttreatment.entity.Login;
import com.dal.patienttreatment.repository.LoginRepo;

@Component
public class PatientAuthProvider implements AuthenticationProvider {

	@Autowired
	LoginRepo loginrepo;
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		Login login = loginrepo.findByUserName(username);
//		System.out.println("Found Travel username" + username);
//		System.out.println("Found Travel pwd" + pwd);
//		System.out.println("Found Travel login" + login);
		if (login == null) {
			throw new StackOverflowError("No user got registered");
		} else if (pwd.equals(login.getPasscode())) {
//			System.out.println("Working,.......");
			return new UsernamePasswordAuthenticationToken(username, pwd,null);
		} else {
			System.out.println("I am a bad credentails");
			throw new StackOverflowError("Invalid Password");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
