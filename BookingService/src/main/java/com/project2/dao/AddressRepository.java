package com.project2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
