package com.hexaware.policymanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Address implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long addressId;
	private String city;
	private String addressLine;
	private String state;
	private int pincode;
	
	@OneToOne(mappedBy = "address")
	private User user;


	public long getAddressId() {
		return addressId;
	}


	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddressLine() {
		return addressLine;
	}


	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	


	public Address(long addressId, String city, String addressLine, String state, int pincode, User user) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressLine = addressLine;
		this.state = state;
		this.pincode = pincode;
		this.user = user;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", addressLine=" + addressLine + ", state="
				+ state + ", pincode=" + pincode + ", user=" + user + "]";
	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	
	
	
	
	
	

	



	
	
	
	
	
	

}
