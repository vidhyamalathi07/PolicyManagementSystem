package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
public class Policy implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long policyId;
	@NotNull
	@NotBlank
	private String policyName;
	@NotNull
	@NotBlank
	private String policyDescription;
	@NotNull
	@NotBlank
	private String policyType;
	@NotNull
	@NotBlank
	private String company;
	
	@Pattern(regexp="^[1-9][0-9]{6}*$")
	private double amount;

	@Pattern(regexp="^[0-9][0-9]*&")
	private int tenure;
	
	@Pattern(regexp="[1-9][0-9]{10}*$")
	private double maturityAmount;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "policy")
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
	public void setAmount(double amount) {
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
	public Policy(long policyId, String policyName, String policyDescription, String policyType, String company,
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
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyDescription="
				+ policyDescription + ", policyType=" + policyType + ", company=" + company + ", amount=" + amount
				+ ", tenure=" + tenure + ", maturityAmount=" + maturityAmount + "]";
	}
	
	
	
	public Policy() {
		super();
	}
	
	public void addUserPolicy(UserPolicy policy)
	{
		policy.setPolicy(this);
		
		Set<UserPolicy> set = getPolicies() ;
		
		set.add(policy);
	}
	
	
	
	
	
	
	

}