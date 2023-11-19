package com.hexaware.policymanagement.entities;

import java.time.LocalDate;


public class UserPolicy {

	private long policyNo;
	private LocalDate startDate;
	private String policyName;
	private String policyType;
	private String company;
	private LocalDate endDate;
	private String paymentInterval;
	private double amount;
	private int tenure;
	private double maturityAmount;
	private double interest;
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
	@Override
	public String toString() {
		return "UserPolicy [policyNo=" + policyNo + ", startDate=" + startDate + ", policyName=" + policyName
				+ ", policyType=" + policyType + ", company=" + company + ", endDate=" + endDate + ", paymentInterval="
				+ paymentInterval + ", amount=" + amount + ", tenure=" + tenure + ", maturityAmount=" + maturityAmount
				+ ", interest=" + interest + "]";
	}
	public UserPolicy(long policyNo, LocalDate startDate, String policyName, String policyType, String company,
			LocalDate endDate, String paymentInterval, double amount, int tenure, double maturityAmount,
			double interest) {
		super();
		this.policyNo = policyNo;
		this.startDate = startDate;
		this.policyName = policyName;
		this.policyType = policyType;
		this.company = company;
		this.endDate = endDate;
		this.paymentInterval = paymentInterval;
		this.amount = amount;
		this.tenure = tenure;
		this.maturityAmount = maturityAmount;
		this.interest = interest;
	}
	public UserPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
