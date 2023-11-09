package com.hexaware.policymanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;
	private String policyName;
	private String policyDescription;
	private String policyType;
	private String company;
	private int amount;
	private int tenure;
	private double maturityAmount;
	
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
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
	
	public Policy(int policyId, String policyName, String policyDescription, String policyType, String company,
			 int amount, int tenure, double maturityAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyDescription = policyDescription;
		this.policyType = policyType;
		this.company = company;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityAmount = maturityAmount;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyDescription="
				+ policyDescription + ", policyType=" + policyType + ", company=" + company + ", amount=" + amount
				+ ", tenure=" + tenure + ", maturityAmount=" + maturityAmount + "]";
	}
	
	
	
	
	
	
	

}