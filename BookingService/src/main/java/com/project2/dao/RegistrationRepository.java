package com.project2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.project2.model.LoginModel;
import com.project2.model.RegistrationModel;

public interface RegistrationRepository extends JpaRepository<RegistrationModel, Integer> {
	
	@Transactional
	void deleteByUser(LoginModel user);
}
