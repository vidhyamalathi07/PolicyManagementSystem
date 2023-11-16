package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


@Entity
public class Policy implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long policyId;

    @NotEmpty(message = "Policy name cannot be empty")
    @Size(max = 100, message = "Policy name cannot exceed 100 characters")
    private String policyName;

    @Size(max = 255, message = "Policy description cannot exceed 255 characters")
    private String policyDescription;

    @NotEmpty(message = "Policy type cannot be empty")
    private String policyType;

    @NotEmpty(message = "Company name cannot be empty")
    @Size(max = 100, message = "Company name cannot exceed 100 characters")
    private String company;

    @Positive(message = "Amount must be a positive number")
    private double amount;

    @Positive(message = "Tenure must be a positive number")
    private int tenure;

    @PositiveOrZero(message = "Maturity amount must be a positive or zero number")
    private double maturityAmount;
    
    @PositiveOrZero(message = "Interest must be a positive or zero number")
    private double interest;
	
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
	
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public Set<UserPolicy> getPolicies() {
		return policies;
	}
	public void setPolicies(Set<UserPolicy> policies) {
		this.policies = policies;
	}
	public Policy(long policyId, String policyName, String policyDescription, String policyType, String company,
			 double amount, int tenure, double maturityAmount,double interest, Set<UserPolicy> policies) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyDescription = policyDescription;
		this.policyType = policyType;
		this.company = company;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityAmount = maturityAmount;
		this.interest = interest;
		this.policies = policies;
	}
	
	
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyDescription="
				+ policyDescription + ", policyType=" + policyType + ", company=" + company + ", amount=" + amount
				+ ", tenure=" + tenure + ", maturityAmount=" + maturityAmount + ", interest=" + interest + ", policies="
				+ policies + "]";
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