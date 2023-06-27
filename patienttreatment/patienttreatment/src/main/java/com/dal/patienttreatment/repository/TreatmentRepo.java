package com.dal.patienttreatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dal.patienttreatment.entity.TreatmentEntity;
@Repository
public interface TreatmentRepo extends CrudRepository<TreatmentEntity, Long> {

}
