package com.hexaware.policymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.Policy;
@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> 
{

}
