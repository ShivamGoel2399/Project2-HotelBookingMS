/**
 * 
 */
package com.project2.service;

import java.util.List;

import com.project2.model.Hotel;


public interface HotelService {
	
	List<Hotel> findAll();
	
	void createHotel(Hotel hotel);

	void deleteHotel(Long hotelId);
	
	void updateHotel(Hotel hotel);
}
