package com.dal.patienttreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.TreatmentDrugEntity;
import com.dal.patienttreatment.service.patienttreatmentService;
@RestController
public class TreatmentDrugController {
	@Autowired
	patienttreatmentService patienttreatmentservice;
	@GetMapping("/getTreatmentDrug")
	public List<TreatmentDrugEntity> TreatmentDruglist() {
		return patienttreatmentservice.TreatmentDruglist();
	}

	@PostMapping("/addTreatmentDrug")
	public TreatmentDrugEntity addTreatmentDrug(@RequestBody TreatmentDrugEntity treatmentdrug) {
		return patienttreatmentservice.addTreatmentDrug(treatmentdrug);
	}

}
