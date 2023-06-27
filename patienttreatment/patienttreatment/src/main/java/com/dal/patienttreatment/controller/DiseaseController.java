package com.dal.patienttreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.DiseaseEntity;
import com.dal.patienttreatment.service.patienttreatmentService;

@RestController
public class DiseaseController {
	@Autowired
	patienttreatmentService patienttreatmentservice;
	// --DiseaseEntity--
	@GetMapping("/getDisease")
	public List<DiseaseEntity> Diseaselist() {
		return patienttreatmentservice.Diseaselist();
	}

	@PostMapping("/addDisease")
	public DiseaseEntity addDisease(@RequestBody DiseaseEntity diseaseentity) {
		return patienttreatmentservice.addDisease(diseaseentity);
	}

}
