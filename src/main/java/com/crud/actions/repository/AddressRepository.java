package com.crud.actions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.actions.vo.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
}
