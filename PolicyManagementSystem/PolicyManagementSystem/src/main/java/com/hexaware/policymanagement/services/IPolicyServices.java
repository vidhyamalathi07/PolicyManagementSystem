package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.dto.PolicyDTO;
import com.hexaware.policymanagement.entity.Policy;

public interface IPolicyServices 
{
	public Policy createPolicy(PolicyDTO policyDTO);
	public Policy updatePolicy(PolicyDTO policyDTO);
	public void deleteByPolicyId(long policyId);
    public List<Policy> getPolicyByPolicyType(String policyType);
    public List<Policy> getPolicyByCompany(String company);
    public List<Policy> getByPremiumLessThan(double premium);
    public List<Policy> getByPremiumGreaterThan(double premium);

	
	public List<Policy> getAllPolicy();

}
