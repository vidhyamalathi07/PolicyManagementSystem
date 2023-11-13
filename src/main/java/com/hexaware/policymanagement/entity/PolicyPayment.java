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
@Table(name="Policy_payments")
public class PolicyPayment implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long txnId;
	private LocalDate paymentDate;
	private long amount;
	private String bank;
	private String paymentStatus;
	private long fine;
	
	@OneToOne
	@JoinColumn(name = "policyNo")
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

	@Override
	public String toString() {
		return "PolicyPayment [txnId=" + txnId + ", paymentDate=" + paymentDate + ", amount=" + amount + ", bank="
				+ bank + ", paymentStatus=" + paymentStatus + ", fine=" + fine + ", userPolicy=" + userPolicy + "]";
	}

	public PolicyPayment(long txnId, LocalDate paymentDate, long amount, String bank, String paymentStatus, long fine,
			UserPolicy userPolicy) {
		super();
		this.txnId = txnId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.bank = bank;
		this.paymentStatus = paymentStatus;
		this.fine = fine;
		this.userPolicy = userPolicy;
	}

	public PolicyPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}