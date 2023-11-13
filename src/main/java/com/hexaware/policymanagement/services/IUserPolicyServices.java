package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.dto.UserPolicyDTO;
import com.hexaware.policymanagement.entity.UserPolicy;

public interface IUserPolicyServices 
{
	public UserPolicy createUserPolicy(UserPolicyDTO userpolicyDTO);
	public UserPolicy updateUserPolicy(UserPolicyDTO userpolicyDTO);
	public void deleteUserPolicyByPolicyNo(long policyNo);
	public UserPolicy getUserPolicyByPolicyNo(long policyNo);

	public List<UserPolicy> getAllUserPolicy();

}
