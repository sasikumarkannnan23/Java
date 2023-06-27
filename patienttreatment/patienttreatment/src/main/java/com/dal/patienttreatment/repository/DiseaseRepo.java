package com.dal.patienttreatment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dal.patienttreatment.entity.DiseaseEntity;

@Repository
public interface DiseaseRepo extends CrudRepository<DiseaseEntity, Long>  {

}
