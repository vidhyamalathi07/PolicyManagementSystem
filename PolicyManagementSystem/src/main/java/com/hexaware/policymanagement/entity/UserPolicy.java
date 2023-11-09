package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userpolicy")
public class UserPolicy implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyNo;
	private int policyId;
	private int userId;
	private String policyName;
	private String policyType;
	private String company;
	private LocalDate startDate;
	private LocalDate endDate;
	private String paymentInterval;
	private int amount;
	private int tenure;
	private double maturityamount;
	private User user;
	private Policy policy;
	
	
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPaymentInterval() {
		return paymentInterval;
	}
	public void setPaymentInterval(String paymentInterval) {
		this.paymentInterval = paymentInterval;
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
	
	
	public UserPolicy(int policyNo, int policyId, int userId, String policyName, String policyType, String company,
			LocalDate startDate, LocalDate endDate, String paymentInterval, int amount, int tenure,
			double maturityamount, User user, Policy policy) {
		super();
		this.policyNo = policyNo;
		this.policyId = policyId;
		this.userId = userId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.company = company;
		this.startDate = startDate;
		this.endDate = endDate;
		this.paymentInterval = paymentInterval;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityamount = maturityamount;
		this.user = user;
		this.policy = policy;
	}
	
	
	@Override
	public String toString() {
		return "UserPolicy [policyNo=" + policyNo + ", policyId=" + policyId + ", userId=" + userId + ", policyName="
				+ policyName + ", policyType=" + policyType + ", company=" + company + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", paymentInterval=" + paymentInterval + ", amount=" + amount + ", tenure="
				+ tenure + ", maturityamount=" + maturityamount + ", user=" + user + ", policy=" + policy + "]";
	}
	
	
	
	




	

}