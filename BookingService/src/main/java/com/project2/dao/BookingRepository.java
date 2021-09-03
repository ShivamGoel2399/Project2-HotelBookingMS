package com.project2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.model.Booking;

public interface BookingRepository extends JpaRepository <Booking, Long> {

}
