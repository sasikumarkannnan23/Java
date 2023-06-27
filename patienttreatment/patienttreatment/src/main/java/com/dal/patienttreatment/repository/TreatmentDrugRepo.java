package com.dal.patienttreatment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dal.patienttreatment.entity.TreatmentDrugEntity;

@Repository
public interface TreatmentDrugRepo extends CrudRepository<TreatmentDrugEntity, Long>{

}
