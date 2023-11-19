package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entities.PolicyPayment;

public interface IPolicyPaymetServices 
{
	public boolean createPolicyPayment(PolicyPayment policypayment);
	public boolean updatePolicyPayment(PolicyPayment policypayment);
	public boolean deletePolicyPayment(PolicyPayment policypayment);
	
    public PolicyPayment getPolicyPaymentById(int txnid);
	
	public List<PolicyPayment> getAllPolicyPayment();

}
