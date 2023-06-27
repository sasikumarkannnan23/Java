package com.dal.patienttreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.TreatmentDiseaseEntity;
import com.dal.patienttreatment.service.patienttreatmentService;
@RestController
public class TreatmentDiseaseController {
	@Autowired
	patienttreatmentService patienttreatmentservice;
	@GetMapping("/getTreatmentDisease")
	public List<TreatmentDiseaseEntity> TreatmentDiseaselist() {
		return patienttreatmentservice.TreatmentDiseaselist();
	}

	@PostMapping("/addTreatmentDisease")
	public TreatmentDiseaseEntity addTreatmentDisease(@RequestBody TreatmentDiseaseEntity treatmentdisease) {
		return patienttreatmentservice.addTreatmentDisease(treatmentdisease);
	}

}
