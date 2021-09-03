/**
 * 
 */
package com.project2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.project2.model.LoginModel;

/**
 * @author User
 *
 */
public interface LoginRepository extends JpaRepository<LoginModel, Long> {

	@Transactional
	void deleteByUsername(String name);
}
