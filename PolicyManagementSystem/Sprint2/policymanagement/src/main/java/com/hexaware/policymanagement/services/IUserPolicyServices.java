package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entities.UserPolicy;

public interface IUserPolicyServices 
{
	public boolean createUserPolicy(UserPolicy userpolicy);
	public boolean updateUserPolicy(UserPolicy userpolicy);
	public boolean deleteUserPolicy(UserPolicy userpolicy);
	
    public UserPolicy getUserPolicyById(int policy_no);
	
	public List<UserPolicy> getAllUserPolicy();

}
