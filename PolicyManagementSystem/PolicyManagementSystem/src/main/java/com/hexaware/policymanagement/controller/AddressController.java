package com.hexaware.policymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.policymanagement.dto.AddressDTO;
import com.hexaware.policymanagement.entity.Address;
import com.hexaware.policymanagement.services.IAddressServices;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController 
{
	@Autowired
	IAddressServices service;
	

	@PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
	public Address createAddress(@RequestBody AddressDTO addressDTO)
	{
		return service.createAddress(addressDTO);
	}
	
	
	@PutMapping(value = "/update",consumes = "application/json",produces = "application/json")
	public Address updateAddress(@RequestBody AddressDTO addressDTO)
	{
		return service.updateAddress(addressDTO);
	}
	
	
	@DeleteMapping(value = "/delete/{addressId}",consumes = "application/json")
	public void deleteByAddressId(@PathVariable long addressId)
	{
		service.deleteByAddressId(addressId);
	}
	
	@GetMapping(value = "/get/state/{state}",produces = "application/json")
	public List<Address> getAddressByState(@PathVariable String state)
	{
		return service.getByState(state);
		
	}
	
	@GetMapping(value = "/get/city/{city}",produces = "application/json")
	public List<Address> getAddressByCity(@PathVariable String city)
	{
		return service.getByCity(city);
		
	}

	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<Address> getAllAddress()
	{
		return service.getAllAddress();
		
	}

}
