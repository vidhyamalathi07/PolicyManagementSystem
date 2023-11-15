package com.hexaware.policymanagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.policymanagement.dto.PolicyDTO;
import com.hexaware.policymanagement.entity.Policy;
import com.hexaware.policymanagement.services.IPolicyServices;


@RestController
@RequestMapping("/api/v1/policies")
public class PolicyController 
{
	@Autowired
	IPolicyServices service;
	
	@PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
	public Policy addPolicy(@RequestBody PolicyDTO policyDTO)
	{
		
		return service.createPolicy(policyDTO);
	}
	
	
	@PutMapping(value = "/update",consumes = "application/json",produces = "application/json")
	public Policy updatePolicy(@RequestBody PolicyDTO policyDTO)
	{
		return service.updatePolicy(policyDTO);
	}
	
	
	@DeleteMapping(value = "/delete/{policyId}",consumes = "application/json")
	public void deletePolicyById(@PathVariable Long policyId)
	{
		service.deleteByPolicyId(policyId);
	}
	
	@GetMapping(value = "/get/company/{company}",produces = "application/json")
	public List<Policy> getPolicyByCompany(@PathVariable String company)
	{
		return service.getPolicyByCompany(company);
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<Policy> getAllPolicy()
	{
		return service.getAllPolicy();
		
	}
	
	@GetMapping(value = "/get/policy-type/{policyType}",produces = "application/json")
	public List<Policy> getPolicyByPolicyType(@PathVariable String policyType)
	{
		return service.getPolicyByPolicyType(policyType);
	}
	
	
	@GetMapping("/get/premiumgt/{premium}")
	public List<Policy> getByPremiumGreaterThan(@PathVariable long premium)
	{
		return service.getByPremiumGreaterThan(premium);
		
	}
	
	@GetMapping("/get/premiumlt/{premium}")
	public List<Policy> getByPremiumLessThan(@PathVariable long premium)
	{
		return service.getByPremiumLessThan(premium);
		
	}	
	
	
	
	/*@GetMapping(value = "/get/{policyId}",produces = "application/json")
	public ResponseEntity<String> getPolicyById(@PathVariable Long policyId) throws PolicyNotFoundException
	{
		
		Policy p = service.getPolicyById(policyId);
		ResponseEntity<String> response;
		if(p==null)
		{
			try 
			{
				throw new PolicyNotFoundException(HttpStatus.BAD_REQUEST, "Policy Not Found with policyId "+ policyId);
	
			}
			catch(PolicyNotFoundException po)
			{
				response = new ResponseEntity<String>(po.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		
		else
		{
			response = new ResponseEntity<String>(p.toString(), HttpStatus.FOUND);

		}
		return response;
	}
	*/
	
	
	
	
}
