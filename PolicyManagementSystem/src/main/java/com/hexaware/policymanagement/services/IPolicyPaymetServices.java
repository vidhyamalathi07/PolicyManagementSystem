package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entity.PolicyPayment;

public interface IPolicyPaymetServices 
{
	public PolicyPayment createPolicyPayment(PolicyPayment policyPayment);
	public PolicyPayment updatePolicyPayment(PolicyPayment policyPayment);
	public PolicyPayment deletePolicyPayment(PolicyPayment policyPayment);
	public PolicyPayment getPolicyPaymentByTxnId(int txnId);
    public PolicyPayment getPolicyPaymentByUserId(int UserId);
    public PolicyPayment getPolicyPaymentByPolicyNo(int PolicyNo);


	
	public List<PolicyPayment> getAllPolicyPayment();

}
