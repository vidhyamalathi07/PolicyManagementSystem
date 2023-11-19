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

import com.hexaware.policymanagement.dto.UserPolicyDTO;
import com.hexaware.policymanagement.entity.UserPolicy;
import com.hexaware.policymanagement.services.IUserPolicyServices;

@RestController
@RequestMapping("/api/v1/userpolicies")
public class UserPolicyController 
{
	@Autowired
	IUserPolicyServices service;
	
	@PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
	public UserPolicy createUserPolicy(@RequestBody UserPolicyDTO userPolicyDTO)
	{
		return service.createUserPolicy(userPolicyDTO);
	}
	
	
	@PutMapping(value = "/update",consumes = "application/json",produces = "application/json")
	public UserPolicy updateUserPolicy(@RequestBody UserPolicyDTO userPolicyDTO)
	{
		return service.updateUserPolicy(userPolicyDTO);
	}
	
	
	@DeleteMapping(value = "/delete/{policyNo}",consumes = "application/json")
	public void deleteUserPolicyByPolicyNo(@PathVariable long policyNo)
	{
		service.deleteUserPolicyByPolicyNo(policyNo);
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<UserPolicy> getAllUserPolicy()
	{
		return service.getAllUserPolicy();
		
	}
	
	
	@GetMapping(value = "/get/{policyNo}",produces = "application/json")
	public UserPolicy getUserPolicyByPolicyNo(@PathVariable long policyNo)
	{
		return service.getUserPolicyByPolicyNo(policyNo);
		
	}
}