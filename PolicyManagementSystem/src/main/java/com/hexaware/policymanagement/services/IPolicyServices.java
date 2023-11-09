package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entity.Policy;

public interface IPolicyServices 
{
	public Policy createPolicy(Policy policy);
	public Policy updatePolicy(Policy policy);
	public Policy deletePolicy(Policy policy);
    public List<Policy> getPolicyByPolicyType(String policyType);
    public List<Policy> getPolicyByCompany(String company);

	
	public List<Policy> getAllPolicy();

}
