package com.dal.patienttreatment.repository;

import org.springframework.data.repository.CrudRepository;

import com.dal.patienttreatment.entity.TreatmentDiseaseEntity;
import com.dal.patienttreatment.entity.TreatmentDrugEntity;

public interface TreatmentDiseaseRepo extends CrudRepository<TreatmentDiseaseEntity, Long> {

}
