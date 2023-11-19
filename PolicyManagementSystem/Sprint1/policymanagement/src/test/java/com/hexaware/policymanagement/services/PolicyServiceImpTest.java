package com.hexaware.policymanagement.services;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.policymanagement.entity.Policy;

class PolicyServiceImpTest {

	PolicyServicesImp ip = new PolicyServicesImp();

	@Test
	void testCreatePolicy() 
	{
		Policy p = new Policy();
		boolean actual = ip.createPolicy(p);
		assertEquals(false, actual);
	}
	
	
	@Test
	void testUpdatePolicy() 
	{
		Policy p = new Policy();
		boolean actual = ip.updatePolicy(p);
		assertEquals(false, actual);
		
	}
	
	
	@Test
	void testDeletePolicy() 
	{
		Policy p = new Policy();
		boolean actual = ip.deletePolicy(p);
		assertEquals(false, actual);
		
	}
	
	
	@Test
	void testGetPolicyById() 
	{
		Policy expected = new Policy(1,"a","b","c","d",1,2,3,4,5);
		Policy actual = ip.getPolicyById(1);
		assertEquals(expected, actual);
		
	}
	
	

	@Test
	void testGetAllPolicy() 
	{
		List<Policy> actual = new ArrayList<Policy>();
		actual.add(new Policy(0,"a","b","c","d",1,2,3,4,5));
		actual.add(new Policy(1,"a","b","c","d",1,2,3,4,5));
		assertEquals(ip.getAllPolicy(), actual);

		
	}

}
