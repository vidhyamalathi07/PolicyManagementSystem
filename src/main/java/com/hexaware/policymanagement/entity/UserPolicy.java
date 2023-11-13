package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="User_policy")
public class UserPolicy implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyNo;
	private LocalDate startDate;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "policyId")
	private Policy policy;
	
	@OneToOne(mappedBy = "userPolicy")
	private PolicyPayment policyPayment;

	private String policyName;
	private String policyType;
	private String company;
	private LocalDate endDate;
	private String paymentInterval;
	private long amount;
	private int tenure;
	private long maturityamount;
	
	
	
	public long getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
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
	public PolicyPayment getPolicyPayment() {
		return policyPayment;
	}
	public void setPolicyPayment(PolicyPayment policyPayment) {
		this.policyPayment = policyPayment;
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
	public long getMaturityamount() {
		return maturityamount;
	}
	public void setMaturityamount(long maturityamount) {
		this.maturityamount = maturityamount;
	}
	
	
	public UserPolicy(long policyNo, LocalDate startDate, User user, Policy policy, PolicyPayment policyPayment,
			 String policyName, String policyType, String company, LocalDate endDate,
			String paymentInterval, long amount, int tenure, long maturityamount) {
		super();
		this.policyNo = policyNo;
		this.startDate = startDate;
		this.user = user;
		this.policy = policy;
		this.policyPayment = policyPayment;
		this.policyName = policyName;
		this.policyType = policyType;
		this.company = company;
		this.endDate = endDate;
		this.paymentInterval = paymentInterval;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityamount = maturityamount;
	}
	
	
	public UserPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserPolicy [policyNo=" + policyNo + ", startDate=" + startDate + ", user=" + user + ", policy=" + policy
				+ ", policyPayment=" + policyPayment + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", company=" + company + ", endDate=" + endDate + ", paymentInterval=" + paymentInterval + ", amount="
				+ amount + ", tenure=" + tenure + ", maturityamount=" + maturityamount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	

}