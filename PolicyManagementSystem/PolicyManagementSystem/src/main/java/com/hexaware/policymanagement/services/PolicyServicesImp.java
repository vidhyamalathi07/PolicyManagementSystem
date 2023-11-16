package com.hexaware.policymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.PolicyDTO;
import com.hexaware.policymanagement.entity.Policy;
import com.hexaware.policymanagement.repository.PolicyRepository;

@Service
public class PolicyServicesImp implements IPolicyServices {
	
	@Autowired
	PolicyRepository policyrepo;

	@Override
	public Policy createPolicy(PolicyDTO policyDTO) {
		Policy policy = new Policy();
		policy.setPolicyName(policyDTO.getPolicyName());
		policy.setPolicyType(policyDTO.getPolicyType());
		policy.setAmount(policyDTO.getAmount());
		policy.setCompany(policyDTO.getCompany());
		policy.setMaturityAmount(policyDTO.getMaturityAmount());
		policy.setPolicyDescription(policyDTO.getPolicyDescription());
		policy.setTenure(policyDTO.getTenure());
		
		return policyrepo.save(policy); 
	}
	

	@Override
	public Policy updatePolicy(PolicyDTO policyDTO) {
		Policy policy = new Policy();
		policy.setPolicyId(policyDTO.getPolicyId());
		policy.setPolicyName(policyDTO.getPolicyName());
		policy.setPolicyType(policyDTO.getPolicyType());
		policy.setAmount(policyDTO.getAmount());
		policy.setCompany(policyDTO.getCompany());
		policy.setMaturityAmount(policyDTO.getMaturityAmount());
		policy.setPolicyDescription(policyDTO.getPolicyDescription());
		policy.setTenure(policyDTO.getTenure());
		
		return policyrepo.save(policy);
	}

	@Override
	public void deleteByPolicyId(long policyId) {
		policyrepo.deleteById(policyId);

	}

	@Override
	public List<Policy> getPolicyByPolicyType(String policyType) {
		
		return policyrepo.findByPolicyType(policyType);
	}

	@Override
	public List<Policy> getPolicyByCompany(String company) {
		return policyrepo.findByCompany(company);
	}

	@Override
	public List<Policy> getAllPolicy() {
		return policyrepo.findAll();
	}


	@Override
	public List<Policy> getByPremiumLessThan(double premium) {
		return policyrepo.findByPremiumLessThan(premium);
	}


	@Override
	public List<Policy> getByPremiumGreaterThan(double premium) {
		return policyrepo.findByPremiumGreaterThan(premium);
	}

}
