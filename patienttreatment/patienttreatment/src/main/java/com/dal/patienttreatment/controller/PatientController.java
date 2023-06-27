package com.dal.patienttreatment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.PatientEntity;
import com.dal.patienttreatment.service.patienttreatmentService;

@RestController
public class PatientController {
	@Autowired
	patienttreatmentService patienttreatmentservice;

	// --PatientEntity--

	@PostMapping("/Patiententry")
	public PatientEntity patientregister(@RequestBody PatientEntity patiententity) {
		return patienttreatmentservice.patientregister(patiententity);
	}

	@GetMapping("/getPatient")
	public List<PatientEntity> Patientlist() {
		return patienttreatmentservice.Patientlist();
	}

	@GetMapping("/getPatientby/{patientId}")
	public Optional<PatientEntity> patientGetById(Long patientId) {
		return patienttreatmentservice.patientGetById(patientId);
	}

	@DeleteMapping("/RemovePatient/{patientId}")
	public void deleteById(@PathVariable Long patientId) {
		patienttreatmentservice.deleteById(patientId);
	}

	   @PutMapping("/updatePatient/{id}")
	    public ResponseEntity<PatientEntity> updatePatient(@PathVariable("id") Long patientId,@RequestBody PatientEntity patiententity)
	    {
		    patiententity.setPatientId(patientId);    
		    PatientEntity updatePatient = patienttreatmentservice.updatePatient(patiententity);
	        return new ResponseEntity<>(updatePatient,HttpStatus.OK);
	    }

}
