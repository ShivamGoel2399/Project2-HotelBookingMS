/**
 * 
 */
package com.project2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.project2.model.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	@Transactional
	void deleteByHotelName(String name);
}
