package com.dal.patienttreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.DrugEntity;
import com.dal.patienttreatment.service.patienttreatmentService;
@RestController
public class DrugController {
	@Autowired
	patienttreatmentService patienttreatmentservice;
	// --DrugEntity--
		@GetMapping("/getDrug")
		public List<DrugEntity> Druglist() {
			return patienttreatmentservice.Druglist();
		}

		@PostMapping("/addDrug")
		public DrugEntity addDrug(@RequestBody DrugEntity drugentity) {
			return patienttreatmentservice.addDrug(drugentity);
		}

}
