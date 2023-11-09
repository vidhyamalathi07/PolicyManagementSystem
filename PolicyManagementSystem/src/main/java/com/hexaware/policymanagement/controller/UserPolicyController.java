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

import com.hexaware.policymanagement.entity.UserPolicy;
import com.hexaware.policymanagement.services.IUserPolicyServices;

@RestController
@RequestMapping("/api/userpolicies")
public class UserPolicyController 
{
	@Autowired
	IUserPolicyServices service;
	
	
	
	@PostMapping(value = "/add")
	public UserPolicy createUserPolicy(@RequestBody UserPolicy policy)
	{
		return service.createUserPolicy(policy);
	}
	
	
	@PutMapping(value = "/update")
	public UserPolicy updateUserPolicy(@RequestBody UserPolicy policy)
	{
		return service.updateUserPolicy(policy);
	}
	
	
	@DeleteMapping(value = "/delete/{policyNo}")
	public void deleteUserPolicyById(@PathVariable int policyNo)
	{
		service.deleteUserPolicyByPolicyNo(policyNo);
		System.out.println("Record has been deleted");
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<UserPolicy> getAllUserPolicy()
	{
		return service.getAllUserPolicy();
		
	}
	
	
	@GetMapping(value = "/get/{policyNo}")
	public UserPolicy getUserPolicyByPolicyNo(@PathVariable int policyNo)
	{
		return service.getUserPolicyByPolicyNo(policyNo);
		
	}
}