package com.hexaware.policymanagement.entities;

import java.util.Objects;

public class Policy 
{
	private int policy_id;
	private String policy_name;
	private String policy_description;
	private String policy_type;
	private String company;
	private int yearsofpayment;
	private int amount;
	private int tenure;
	private double maturity_amount;
	private int validity;
	
	
	public Policy() 
	{
		super();
	}
	
	public Policy(int policy_id, String policy_name, String policy_description, String policy_type, String company,
			int yearsofpayment, int amount, int tenure, double maturity_amount, int validity) 
	{
		super();
		this.policy_id = policy_id;
		this.policy_name = policy_name;
		this.policy_description = policy_description;
		this.policy_type = policy_type;
		this.company = company;
		this.yearsofpayment = yearsofpayment;
		this.amount = amount;
		this.tenure = tenure;
		this.maturity_amount = maturity_amount;
		this.validity = validity;
	}
	
	
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPolicy_description() {
		return policy_description;
	}
	public void setPolicy_description(String policy_description) {
		this.policy_description = policy_description;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getYearsofpayment() {
		return yearsofpayment;
	}
	public void setYearsofpayment(int yearsofpayment) {
		this.yearsofpayment = yearsofpayment;
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
	public double getMaturity_amount() {
		return maturity_amount;
	}
	public void setMaturity_amount(double maturity_amount) {
		this.maturity_amount = maturity_amount;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "PolicyInfo [policy_id=" + policy_id + ", policy_name=" + policy_name + ", policy_description="
				+ policy_description + ", policy_type=" + policy_type + ", company=" + company + ", yearsofpayment="
				+ yearsofpayment + ", amount=" + amount + ", tenure=" + tenure + ", maturity_amount=" + maturity_amount
				+ ", validity=" + validity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, company, maturity_amount, policy_description, policy_id, policy_name, policy_type,
				tenure, validity, yearsofpayment);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		return amount == other.amount && Objects.equals(company, other.company)
				&& Double.doubleToLongBits(maturity_amount) == Double.doubleToLongBits(other.maturity_amount)
				&& Objects.equals(policy_description, other.policy_description) && policy_id == other.policy_id
				&& Objects.equals(policy_name, other.policy_name) && Objects.equals(policy_type, other.policy_type)
				&& tenure == other.tenure && validity == other.validity && yearsofpayment == other.yearsofpayment;
	}
	
	
	

}