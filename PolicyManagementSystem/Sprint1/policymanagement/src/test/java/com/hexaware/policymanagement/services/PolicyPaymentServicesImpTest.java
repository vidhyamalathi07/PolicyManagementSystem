package com.hexaware.policymanagement.services;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.policymanagement.entity.PolicyPayment;

class PolicyPaymentServicesImpTest 
{

	PolicyPaymentServicesImp ipp = new PolicyPaymentServicesImp();

	
	@Test
	void testCreatePolicyPayment() 
	{
		PolicyPayment p = new PolicyPayment();
		boolean actual = ipp.createPolicyPayment(p);
		assertEquals(false, actual);
	}

	
	@Test
	void testUpdatePolicyPayment() 
	{
		PolicyPayment p = new PolicyPayment();
		boolean actual = ipp.updatePolicyPayment(p);
		assertEquals(false, actual);

	}

	
	@Test
	void testDeletePolicyPayment() 
	{
		PolicyPayment p = new PolicyPayment();
		boolean actual = ipp.deletePolicyPayment(p);
		assertEquals(false, actual);

	}

	
	@Test
	void testGetPolicyPaymentById() 
	{
		PolicyPayment expected = new PolicyPayment(1, 1, 1, 1, 1, "a", "a", 1);
		PolicyPayment actual = ipp.getPolicyPaymentById(1);
		assertEquals(expected, actual);

	}

	@Test
	void testGetAllPolicyPayment() {
		List<PolicyPayment> actual = new ArrayList<>();
		actual.add(new PolicyPayment(1, 1, 1, 1, 1, "a", "a", 1));
		actual.add(new PolicyPayment(2, 2, 1, 1, 1, "a", "a", 1));
		assertEquals(ipp.getAllPolicyPayment(), actual);

	}

}
