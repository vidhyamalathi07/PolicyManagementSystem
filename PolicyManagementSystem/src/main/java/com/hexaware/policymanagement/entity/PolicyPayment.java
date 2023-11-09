package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy_payments")
public class PolicyPayment implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int txnId;
	private int userId;
	private int policyNo;
	private LocalDate paymentDate;
	private int amount;
	private String bank;
	private String paymentStatus;
	private double fine;
	
	
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
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
	
	
	public PolicyPayment(int txnId, int userId, int policyNo, LocalDate paymentDate, int amount, String bank,
			String paymentStatus, double fine) {
		super();
		this.txnId = txnId;
		this.userId = userId;
		this.policyNo = policyNo;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.bank = bank;
		this.paymentStatus = paymentStatus;
		this.fine = fine;
	}
	@Override
	public String toString() {
		return "PolicyPayment [txnId=" + txnId + ", userId=" + userId + ", policyNo=" + policyNo
				+ ", paymentDate=" + paymentDate + ", amount=" + amount + ", bank=" + bank
				+ ", paymentStatus=" + paymentStatus + ", fine=" + fine + "]";
	}
	
	
	
	
	
	
	
	
}