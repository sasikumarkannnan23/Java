package com.dal.patienttreatment.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dal.patienttreatment.entity.PatientEntity;

@Repository
public interface PatientRepo extends CrudRepository<PatientEntity, Long> {
	public Optional<PatientEntity> findById(Long travellerid);
}
