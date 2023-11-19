package com.hexaware.policymanagement.services;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.policymanagement.entity.User;

class UserServicesImpTest 
{
	UserServicesImp us = new UserServicesImp();

	
	@Test
	void testCreateUser() 
	{
		User u = new User();
		boolean actual = us.createUser(u);
		assertEquals(false, actual);
		
	}
	
	@Test
	void testUpdateUser() 
	{
		User u = new User();
		boolean actual = us.updateUser(u);
		assertEquals(false, actual);
		
	}
	
	
	@Test
	void testDeleteUser() 
	{
		User u = new User();
		boolean actual = us.deleteUser(u);
		assertEquals(false, actual);
		
	}
	
	@Test
	void testGetUserById() 
	{
		User expected = new User(1,"a","a","a",1,"a","a",null,null);
		User actual = us.getUserById(1);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetAllUser() 
	{
		List<User> actual = new ArrayList<>();
		actual.add(new User(1,"a","a","a",1,"a","a",null,null));
		assertEquals(us.getAllUser(), actual);
	}

}
