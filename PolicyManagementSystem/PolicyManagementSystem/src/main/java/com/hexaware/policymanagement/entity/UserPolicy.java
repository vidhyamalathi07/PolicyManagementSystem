package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


@Entity
public class UserPolicy implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	@Id
	private long policyNo;
	 
	@NotNull(message = "Start date cannot be null")
    @FutureOrPresent(message = "Start date must be in the present or future")
    private LocalDate startDate;

    @NotEmpty(message = "Policy name cannot be empty")
    @Size(max = 100, message = "Policy name cannot exceed 100 characters")
    private String policyName;

    @NotEmpty(message = "Policy type cannot be empty")
    private String policyType;

    @NotEmpty(message = "Company name cannot be empty")
    @Size(max = 100, message = "Company name cannot exceed 100 characters")
    private String company;

    @NotNull(message = "End date cannot be null")
    @Future(message = "End date must be in the future")
    private LocalDate endDate;

    @Pattern(regexp = "^(Monthly|Quarterly|Annually)$", message = "Invalid payment interval")
    private String paymentInterval;

    @Positive(message = "Amount must be a positive number")
    private double amount;

    @Positive(message = "Tenure must be a positive number")
    private int tenure;

    @PositiveOrZero(message = "Maturity amount must be a positive or zero number")
    private double maturityAmount;
    
    @PositiveOrZero(message = "Interest must be a positive or zero number")
    private double interest;
    
     
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "policyId")
	private Policy policy;
	
	@OneToOne(mappedBy = "userPolicy")
	private PolicyPayment policyPayment;
	
	
	
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
	public double getMaturityamount() {
		return maturityAmount;
	}
	public void setMaturityamount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public UserPolicy(long policyNo, LocalDate startDate, User user, Policy policy, PolicyPayment policyPayment,
			 String policyName, String policyType, String company, LocalDate endDate,
			String paymentInterval, double amount, int tenure, double maturityAmount,double interest) {
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
		this.maturityAmount = maturityAmount;
		this.interest = interest;
	}
	
	
	public UserPolicy() {
		super();
	}
	@Override
	public String toString() {
		return "UserPolicy [policyNo=" + policyNo + ", startDate=" + startDate + ", policyName=" + policyName
				+ ", policyType=" + policyType + ", company=" + company + ", endDate=" + endDate + ", paymentInterval="
				+ paymentInterval + ", amount=" + amount + ", tenure=" + tenure + ", maturityAmount=" + maturityAmount
				+ ", interest=" + interest + ", user=" + user + ", policy=" + policy + ", policyPayment="
				+ policyPayment + "]";
	}
	
	
}