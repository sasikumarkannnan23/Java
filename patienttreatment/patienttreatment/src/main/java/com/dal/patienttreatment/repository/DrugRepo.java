package com.dal.patienttreatment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dal.patienttreatment.entity.DrugEntity;

@Repository
public interface DrugRepo extends CrudRepository<DrugEntity, Long> {

}
