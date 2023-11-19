package com.hexaware.policymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.PolicyPayment;
@Repository
public interface PolicyPaymentRepository extends JpaRepository<PolicyPayment, Long> 
{
	
	public PolicyPayment findByUserPolicy(PolicyPayment policyNo);
	


}
