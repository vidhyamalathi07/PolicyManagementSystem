package com.hexaware.policymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.UserPolicyDTO;
import com.hexaware.policymanagement.entity.UserPolicy;
import com.hexaware.policymanagement.repository.UserPolicyRepository;

@Service
public class UserPolicyServicesImp implements IUserPolicyServices {
	
	@Autowired
	UserPolicyRepository userpolicyrepo;

	@Override
	public UserPolicy createUserPolicy(UserPolicyDTO userpolicyDTO) {
		UserPolicy userpolicy = new UserPolicy();
		userpolicy.setPolicyName(userpolicyDTO.getPolicyName());
		userpolicy.setPolicyType(userpolicyDTO.getPolicyType());
		userpolicy.setCompany(userpolicyDTO.getCompany());
		userpolicy.setStartDate(userpolicyDTO.getStartDate());
		userpolicy.setEndDate(userpolicyDTO.getEndDate());
		userpolicy.setAmount(userpolicyDTO.getAmount());
		userpolicy.setMaturityamount(userpolicyDTO.getMaturityamount());
		userpolicy.setPaymentInterval(userpolicyDTO.getPaymentInterval());
		userpolicy.setTenure(userpolicyDTO.getTenure());
		userpolicy.setPolicy(userpolicyDTO.getPolicy());
		userpolicy.setUser(userpolicyDTO.getUser());
		
		return userpolicyrepo.save(userpolicy);
	}

	@Override
	public UserPolicy updateUserPolicy(UserPolicyDTO userpolicyDTO) {
		UserPolicy userpolicy = new UserPolicy();
		userpolicy.setPolicyNo(userpolicyDTO.getPolicyNo());
		userpolicy.setPolicyName(userpolicyDTO.getPolicyName());
		userpolicy.setPolicyType(userpolicyDTO.getPolicyType());
		userpolicy.setCompany(userpolicyDTO.getCompany());
		userpolicy.setStartDate(userpolicyDTO.getStartDate());
		userpolicy.setEndDate(userpolicyDTO.getEndDate());
		userpolicy.setAmount(userpolicyDTO.getAmount());
		userpolicy.setMaturityamount(userpolicyDTO.getMaturityamount());
		userpolicy.setPaymentInterval(userpolicyDTO.getPaymentInterval());
		userpolicy.setTenure(userpolicyDTO.getTenure());
		userpolicy.setPolicy(userpolicyDTO.getPolicy());
		userpolicy.setUser(userpolicyDTO.getUser());
		
		return userpolicyrepo.save(userpolicy);

	}

	@Override
	public void deleteUserPolicyByPolicyNo(long policyNo) {
		userpolicyrepo.deleteById(policyNo);
	}

	@Override
	public UserPolicy getUserPolicyByPolicyNo(long policyNo) {
		return userpolicyrepo.findById(policyNo).orElse(new UserPolicy());
	}


	@Override
	public List<UserPolicy> getAllUserPolicy() {
		return userpolicyrepo.findAll();
	}

}
