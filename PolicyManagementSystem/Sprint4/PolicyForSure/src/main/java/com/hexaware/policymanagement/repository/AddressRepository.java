package com.hexaware.policymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> 
{
	public List<Address> findByState(String state);
	
	public List<Address> findByCity(String city);




}
