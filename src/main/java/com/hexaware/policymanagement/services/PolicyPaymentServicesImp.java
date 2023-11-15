package com.hexaware.policymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.PolicyPaymentDTO;
import com.hexaware.policymanagement.entity.PolicyPayment;
import com.hexaware.policymanagement.repository.PolicyPaymentRepository;

@Service
public class PolicyPaymentServicesImp implements IPolicyPaymentServices {
	
	@Autowired
	PolicyPaymentRepository policypayrepo;

	@Override
	public PolicyPayment createPolicyPayment(PolicyPaymentDTO policyPaymentDTO) {
		PolicyPayment policyPayment = new PolicyPayment();
		policyPayment.setAmount(policyPaymentDTO.getAmount());
		policyPayment.setBank(policyPaymentDTO.getBank());
		policyPayment.setFine(policyPaymentDTO.getFine());
		policyPayment.setPaymentDate(policyPaymentDTO.getPaymentDate());
		policyPayment.setPaymentStatus(policyPaymentDTO.getPaymentStatus());
		policyPayment.setUserPolicy(policyPaymentDTO.getUserPolicy());
		
		return policypayrepo.save(policyPayment);
	}

	@Override
	public PolicyPayment updatePolicyPayment(PolicyPaymentDTO policyPaymentDTO) {
		PolicyPayment policyPayment = new PolicyPayment();
		policyPayment.setTxnId(policyPaymentDTO.getTxnId());
		policyPayment.setAmount(policyPaymentDTO.getAmount());
		policyPayment.setBank(policyPaymentDTO.getBank());
		policyPayment.setFine(policyPaymentDTO.getFine());
		policyPayment.setPaymentDate(policyPaymentDTO.getPaymentDate());
		policyPayment.setPaymentStatus(policyPaymentDTO.getPaymentStatus());
		policyPayment.setUserPolicy(policyPaymentDTO.getUserPolicy());
		
		return policypayrepo.save(policyPayment);
	}

	@Override
	public void deletePolicyPaymentByTxnId(long txnId) {
		policypayrepo.deleteById(txnId);
	}

	@Override
	public PolicyPayment getPolicyPaymentByTxnId(long txnId) {
		
		return policypayrepo.findById(txnId).orElse(new PolicyPayment());
	}

	@Override
	public PolicyPayment getPolicyPaymentByPolicyNo(PolicyPayment PolicyNo) {
		
		return policypayrepo.findByPolicyNo(PolicyNo);
	}

	@Override
	public List<PolicyPayment> getAllPolicyPayment() {
		return policypayrepo.findAll();
	}

	
}
