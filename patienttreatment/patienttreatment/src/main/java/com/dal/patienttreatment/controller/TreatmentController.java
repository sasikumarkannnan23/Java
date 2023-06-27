package com.dal.patienttreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dal.patienttreatment.entity.TreatmentEntity;
import com.dal.patienttreatment.service.patienttreatmentService;
@RestController
public class TreatmentController {
	@Autowired
	patienttreatmentService patienttreatmentservice;
	// --TreatmentEntity--
		@PostMapping("/TreatmentEntry")
		public TreatmentEntity saveTreatment(@RequestBody TreatmentEntity treatmententity) {
			return patienttreatmentservice.saveTreatment(treatmententity);
		}

		@GetMapping("/getTreatment")
		public List<TreatmentEntity> Treatmentlist() {
			return patienttreatmentservice.Treatmentlist();
		}

}
