package com.dal.patienttreatment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dal.patienttreatment.entity.Login;


@Repository
public interface LoginRepo extends CrudRepository<Login, Long> {
	Login findByUserName(String userName);

}
