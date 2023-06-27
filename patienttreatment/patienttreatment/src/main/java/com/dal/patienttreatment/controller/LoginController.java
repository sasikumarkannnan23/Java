package com.dal.patienttreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.DrugEntity;
import com.dal.patienttreatment.entity.Login;
import com.dal.patienttreatment.service.patienttreatmentService;

@RestController
public class LoginController {
	
	@Autowired
	patienttreatmentService patienttreatmentservice;
	// --DrugEntity--
		@GetMapping("/LoginEntry")
		public List<Login> login() {
			return patienttreatmentservice.login();
		}

		@PostMapping("/LoginData")
		public Login loginentry(@RequestBody Login login) {
			return patienttreatmentservice.loginentry(login);
		}
		public String hello() {

            return "Welcome to Patient and Treatment System";

        }

}
