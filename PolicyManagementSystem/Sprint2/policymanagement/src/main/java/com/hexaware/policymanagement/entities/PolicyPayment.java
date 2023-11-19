package com.hexaware.policymanagement.entities;

public class PolicyPayment {
	private int txn_id;
	private int user_id;
	private int policy_num;
	private int dateofpaymentdate;
	private int amount;
	private String bank;
	private String payment_status;
	private double fine;
	public PolicyPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyPayment(int txn_id, int user_id, int policy_num, int dateofpaymentdate, int amount, String bank,
			String payment_status, double fine) {
		super();
		this.txn_id = txn_id;
		this.user_id = user_id;
		this.policy_num = policy_num;
		this.dateofpaymentdate = dateofpaymentdate;
		this.amount = amount;
		this.bank = bank;
		this.payment_status = payment_status;
		this.fine = fine;
	}
	public int getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(int txn_id) {
		this.txn_id = txn_id;
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
	public int getDateofpaymentdate() {
		return dateofpaymentdate;
	}
	public void setDateofpaymentdate(int dateofpaymentdate) {
		this.dateofpaymentdate = dateofpaymentdate;
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
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	
}