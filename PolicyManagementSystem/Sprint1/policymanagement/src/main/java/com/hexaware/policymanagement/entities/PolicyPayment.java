package com.hexaware.policymanagement.entities;

import java.time.LocalDate;

public class PolicyPayment {
	private long txnId;
	private LocalDate paymentDate;
	private double amount;
	private String bank;
	private String paymentStatus;
	private double fine;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
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
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	@Override
	public String toString() {
		return "PolicyPayment [txnId=" + txnId + ", paymentDate=" + paymentDate + ", amount=" + amount + ", bank="
				+ bank + ", paymentStatus=" + paymentStatus + ", fine=" + fine + "]";
	}
	public PolicyPayment(long txnId, LocalDate paymentDate, double amount, String bank, String paymentStatus,
			double fine) {
		super();
		this.txnId = txnId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.bank = bank;
		this.paymentStatus = paymentStatus;
		this.fine = fine;
	}
	public PolicyPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
