package com.hexaware.policymanagement.dto;

import java.util.HashSet;
import java.util.Set;

import com.hexaware.policymanagement.entity.UserPolicy;

public class PolicyDTO 
{
	private long policyId;
	private String policyName;
	private String policyDescription;
	private String policyType;
	private String company;
	private double amount;
	private int tenure;
	private double maturityAmount;
	
	private Set<UserPolicy> policies = new HashSet<>();

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyDescription() {
		return policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public Set<UserPolicy> getPolicies() {
		return policies;
	}

	public void setPolicies(Set<UserPolicy> policies) {
		this.policies = policies;
	}

	public PolicyDTO(long policyId, String policyName, String policyDescription, String policyType, String company,
			double amount, int tenure, double maturityAmount, Set<UserPolicy> policies) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyDescription = policyDescription;
		this.policyType = policyType;
		this.company = company;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityAmount = maturityAmount;
		this.policies = policies;
	}

	public PolicyDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PolicyDTO [policyId=" + policyId + ", policyName=" + policyName + ", policyDescription="
				+ policyDescription + ", policyType=" + policyType + ", company=" + company + ", amount=" + amount
				+ ", tenure=" + tenure + ", maturityAmount=" + maturityAmount + ", policies=" + policies + "]";
	}
	
	
	
	
	
	
	
	

}