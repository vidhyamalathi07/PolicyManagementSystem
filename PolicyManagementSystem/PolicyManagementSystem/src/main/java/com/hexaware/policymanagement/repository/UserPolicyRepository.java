package com.hexaware.policymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.User;
import com.hexaware.policymanagement.entity.UserPolicy;

@Repository
public interface UserPolicyRepository extends JpaRepository<UserPolicy, Long>
{	
	@Query("select p from UserPolicy p where p.user =?1 ")
	public List<UserPolicy> getUserPoliciesByUserId(User userId);
}



