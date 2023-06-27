package com.dal.patienttreatment;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dal.patienttreatment.controller.LoginController;
import com.dal.patienttreatment.entity.Login;
import com.dal.patienttreatment.repository.LoginRepo;
import com.dal.patienttreatment.service.patienttreatmentService;

@SpringBootTest
class PatienttreatmentApplicationTests {

	   @Mock
	    private LoginRepo loginrepo;

	    @Mock
	    private patienttreatmentService patienttreatmentservice;

	    @InjectMocks
	    private LoginController logincontroller;

	    @BeforeEach
	    public void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }
	    @Test

        public void testHelloAppln() {

            String result = logincontroller.hello();

            assertEquals("Welcome to Patient and Treatment System", result);

        }
//	    
//	    @Test
//	    public void testSearchByTravellerName() {
//	        String tname = "Test";
//	        Login login = new Login();
//	        login.setLid(1L);
//	        login.setUserName(tname);
//	        when(loginrepo.findByUserName(tname)).thenReturn(login);
//
//	        Login result = Logincontroller.findByLoginName(tname);
//	        assertEquals(login, result);
//	    }

}
