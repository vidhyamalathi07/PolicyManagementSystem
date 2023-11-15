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

import com.hexaware.policymanagement.dto.UserDTO;
import com.hexaware.policymanagement.entity.User;
import com.hexaware.policymanagement.services.IUserServices;

@RestController
@RequestMapping("/api/v1/users")
public class UserController 
{
	@Autowired
	IUserServices service;
	
	@PostMapping(value = "/add")
	public User createUser(@RequestBody UserDTO userDTO)
	{
		return service.createUser(userDTO);
	}
	
	
	@PutMapping(value = "/update")
	public User updateUser(@RequestBody UserDTO userDTO)
	{
		return service.updateUser(userDTO);
	}
	
	
	@DeleteMapping(value = "/delete/{userId}")
	public void deleteByUserId(@PathVariable long userId)
	{
		service.deleteByUserId(userId);
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<User> getAllUser()
	{
		return service.getAllUser();
		
	}
	
	
	@GetMapping(value = "/get/mobile/{mobNo}")
	public User getUserByMobNo(@PathVariable String mobNo)
	{
		return service.getUserByMobNo(mobNo);
		
	}
	
	@GetMapping(value = "/get/email/{email}")
	public User getUserPolicyByEmail(@PathVariable String email)
	{
		return service.getUserByEmail(email);
		
	}
	
	@GetMapping(value = "/get/type/{userType}")
	public List<User> getUserByUserType(@PathVariable String userType)
	{
		return service.getUserByUserType(userType);
		
	}
	
	@GetMapping(value = "/get/category/{userCategory}")
	public List<User> getUserByUserCategory(@PathVariable String userCategory)
	{
		return service.getUserByUserCategory(userCategory);
		
	}

}
