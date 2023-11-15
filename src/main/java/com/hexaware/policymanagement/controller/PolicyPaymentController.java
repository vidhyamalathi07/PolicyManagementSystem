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

import com.hexaware.policymanagement.dto.PolicyPaymentDTO;
import com.hexaware.policymanagement.entity.PolicyPayment;
import com.hexaware.policymanagement.services.IPolicyPaymentServices;

@RestController
@RequestMapping("/api/v1/policy-payment")
public class PolicyPaymentController 
{
	@Autowired
	IPolicyPaymentServices service;


	@PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
	public PolicyPayment createPolicyPayment(@RequestBody PolicyPaymentDTO policyPaymentDTO)
	{
		return service.createPolicyPayment(policyPaymentDTO);
	}
	
	
	@PutMapping(value = "/update",consumes = "application/json",produces = "application/json")
	public PolicyPayment updatePolicyPayment(@RequestBody PolicyPaymentDTO policyPaymentDTO)
	{
		return service.updatePolicyPayment(policyPaymentDTO);
	}
	
	
	@DeleteMapping(value = "/delete/{TxnId}",consumes = "application/json")
	public void deletePolicyPaymentByTxnId(@PathVariable long TxnId)
	{
		service.deletePolicyPaymentByTxnId(TxnId);
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<PolicyPayment> getAllPolicyPayment()
	{
		return service.getAllPolicyPayment();
		
	}
	
	
	@GetMapping(value = "/get/policy-no/{policyNo}",produces = "application/json")
	public PolicyPayment getPolicyPaymentByPolicyNo(@PathVariable PolicyPayment policyNo)
	{
		return service.getPolicyPaymentByPolicyNo(policyNo);
		
	}
	
	@GetMapping(value = "/get/txnId/{txnId}",produces = "application/json")
	public PolicyPayment getPolicyPaymentByTxnId(@PathVariable long txnId)
	{
		return service.getPolicyPaymentByTxnId(txnId);
		
	}

}
