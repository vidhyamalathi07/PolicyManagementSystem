package com.hexaware.policymanagement.services;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.policymanagement.entities.Policy;

class IPolicyServiceImpTest {

	IPolicyServicesImp ip = new IPolicyServicesImp();

	@Test
	void testCreatePolicy() 
	{
		Policy p = new Policy();
		boolean actual = ip.createPolicy(p);
		assertEquals(false, actual);
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
