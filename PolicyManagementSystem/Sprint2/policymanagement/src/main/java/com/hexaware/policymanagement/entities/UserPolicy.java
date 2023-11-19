package com.hexaware.policymanagement.entities;

import java.time.LocalDate;

public class UserPolicy 
{
	private int policy_id;
	private int user_id;
	private int policy_num;
	private String policy_name;
	private String policy_type;
	private String company;
	private LocalDate start_date;
	private LocalDate end_date;
	private String payment_interval;
	private int amount;
	private int tenure;
	private double maturityamount;
	private int validity;
	
	private User user;
	private Policy policy;
	
	
	
	
	
	public UserPolicy() 
	{
		super();
	}


	public UserPolicy(int policy_id, int user_id, int policy_num, String policy_name, String policy_type,
			String company, LocalDate start_date, LocalDate end_date, String payment_interval, int amount, int tenure,
			double maturityamount, int validity, User user, Policy policy) 
	{
		super();
		this.policy_id = policy_id;
		this.user_id = user_id;
		this.policy_num = policy_num;
		this.policy_name = policy_name;
		this.policy_type = policy_type;
		this.company = company;
		this.start_date = start_date;
		this.end_date = end_date;
		this.payment_interval = payment_interval;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityamount = maturityamount;
		this.validity = validity;
		this.user = user;
		this.policy = policy;
	}
	

	public int getPolicy_id() {
		return policy_id;
	}



	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public int getPolicy_num() {
		return policy_num;
	}



	public void setPolicy_num(int policy_num) {
		this.policy_num = policy_num;
	}



	public String getPolicy_name() {
		return policy_name;
	}



	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
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



	public LocalDate getStart_date() {
		return start_date;
	}



	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}



	public LocalDate getEnd_date() {
		return end_date;
	}



	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}



	public String getPayment_interval() {
		return payment_interval;
	}



	public void setPayment_interval(String payment_interval) {
		this.payment_interval = payment_interval;
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



	public double getMaturityamount() {
		return maturityamount;
	}



	public void setMaturityamount(double maturityamount) {
		this.maturityamount = maturityamount;
	}



	public int getValidity() {
		return validity;
	}



	public void setValidity(int validity) {
		this.validity = validity;
	}
	
	
	
	public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }


	@Override
	public String toString() 
	{
		return "UserPolicy [policy_id=" + policy_id + ", user_id=" + user_id + ", policy_num=" + policy_num
				+ ", policy_name=" + policy_name + ", policy_type=" + policy_type + ", company=" + company
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", payment_interval=" + payment_interval
				+ ", amount=" + amount + ", tenure=" + tenure + ", maturityamount=" + maturityamount + ", validity="
				+ validity + ", user=" + user + ", policy=" + policy + "]";
	}




	

}