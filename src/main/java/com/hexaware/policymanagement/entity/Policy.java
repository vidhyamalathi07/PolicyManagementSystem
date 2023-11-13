package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Policy_details")
public class Policy implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyId;
	private String policyName;
	private String policyDescription;
	private String policyType;
	private String company;
	private long amount;
	private int tenure;
	private long maturityAmount;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "policy")
	private Set<UserPolicy> policies = new HashSet<UserPolicy>();
	
	
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
	public long getAmount() {
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
	public long getMaturityAmount() {
		return maturityAmount;
	}
	public void setMaturityAmount(long maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	
	
	public Set<UserPolicy> getPolicies() {
		return policies;
	}
	public void setPolicies(Set<UserPolicy> policies) {
		this.policies = policies;
	}
	public Policy(long policyId, String policyName, String policyDescription, String policyType, String company,
			 long amount, int tenure, long maturityAmount, Set<UserPolicy> policies) {
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
		// TODO Auto-generated constructor stub
	}
	
	public void addUserPolicy(UserPolicy policy)
	{
		policy.setPolicy(this);
		
		Set<UserPolicy> set = getPolicies() ;
		
		set.add(policy);
	}
	
	
	
	
	
	
	

}