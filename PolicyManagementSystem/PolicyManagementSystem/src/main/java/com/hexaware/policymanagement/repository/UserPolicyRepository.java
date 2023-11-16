package com.hexaware.policymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.User;
import com.hexaware.policymanagement.entity.UserPolicy;

@Repository
public interface UserPolicyRepository extends JpaRepository<UserPolicy, Long>
{
	public UserPolicy findByPolicyNo(long policyNo);
	
	public UserPolicy findByUserId(long userId);
	
	


}
