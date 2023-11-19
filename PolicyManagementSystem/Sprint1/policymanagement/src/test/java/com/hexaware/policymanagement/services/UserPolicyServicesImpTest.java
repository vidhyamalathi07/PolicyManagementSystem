package com.hexaware.policymanagement.services;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.policymanagement.entity.UserPolicy;

class UserPolicyServicesImpTest {
	
	UserPolicyServicesImp up =  new UserPolicyServicesImp();

	@Test
	void testCreateUserPolicy() 
	{
		UserPolicy p = new UserPolicy();
		boolean actual = up.createUserPolicy(p);
		assertEquals(false, actual);
	}
	
	@Test
	void testUpdateUserPolicy() 
	{
		UserPolicy p = new UserPolicy();
		boolean actual = up.updateUserPolicy(p);
		assertEquals(false, actual);
	}
	
	@Test
	void testDeletUserPolicy() 
	{
		UserPolicy p = new UserPolicy();
		boolean actual = up.deleteUserPolicy(p);
		assertEquals(false, actual);
	}
	
	@Test
	void testGetUserPolicyById() 
	{
		UserPolicy expected = new UserPolicy(1,1,1,"a","b","c",null,null,"d",1,1,1,1,null,null);
		UserPolicy actual = up.getUserPolicyById(1);
		assertEquals(expected, actual);
	}

	@Test
	void testGetAllUserPolicy() 
	{
		List<UserPolicy> actual = new ArrayList<>();
		actual.add(new UserPolicy(1,1,1,"a","b","c",null,null,"d",1,1,1,1,null,null));
		
		assertEquals(up.getAllUserPolicy(), actual);
			
	}

}
