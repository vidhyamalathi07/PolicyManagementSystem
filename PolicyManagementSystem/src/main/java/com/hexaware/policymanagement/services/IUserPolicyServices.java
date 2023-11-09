package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entity.UserPolicy;

public interface IUserPolicyServices 
{
	public UserPolicy createUserPolicy(UserPolicy userpolicy);
	public UserPolicy updateUserPolicy(UserPolicy userpolicy);
	public void deleteUserPolicyByPolicyNo(int policyNo);
	public UserPolicy getUserPolicyByPolicyNo(int policyNo);
    public List<UserPolicy> getUserPolicyByUserId(int userId);

	public List<UserPolicy> getAllUserPolicy();

}
