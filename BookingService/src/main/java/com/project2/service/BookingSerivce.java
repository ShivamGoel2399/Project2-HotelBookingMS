package com.project2.service;

import java.util.List;

import com.project2.model.Booking;

public interface BookingSerivce {

	List<Booking> findAll();

	void addBooking(Booking book);
}
