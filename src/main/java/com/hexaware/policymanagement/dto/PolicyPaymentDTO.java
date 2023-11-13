package com.hexaware.policymanagement.dto;

import java.time.LocalDate;

import com.hexaware.policymanagement.entity.UserPolicy;

public class PolicyPaymentDTO 
{
	private long txnId;
	private LocalDate paymentDate;
	private long amount;
	private String bank;
	private String paymentStatus;
	private long fine;
	
	private UserPolicy userPolicy;

	public long getTxnId() {
		return txnId;
	}

	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public long getFine() {
		return fine;
	}

	public void setFine(long fine) {
		this.fine = fine;
	}

	public UserPolicy getUserPolicy() {
		return userPolicy;
	}

	public void setUserPolicy(UserPolicy userPolicy) {
		this.userPolicy = userPolicy;
	}

	public PolicyPaymentDTO(long txnId, LocalDate paymentDate, long amount, String bank, String paymentStatus,
			long fine, UserPolicy userPolicy) {
		super();
		this.txnId = txnId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.bank = bank;
		this.paymentStatus = paymentStatus;
		this.fine = fine;
		this.userPolicy = userPolicy;
	}

	public PolicyPaymentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PolicyPaymentDTO [txnId=" + txnId + ", paymentDate=" + paymentDate + ", amount=" + amount + ", bank="
				+ bank + ", paymentStatus=" + paymentStatus + ", fine=" + fine + ", userPolicy=" + userPolicy + "]";
	}
	
	
	
	
	
	
	
	
}