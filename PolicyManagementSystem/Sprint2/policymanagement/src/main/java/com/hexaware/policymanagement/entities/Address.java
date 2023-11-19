package com.hexaware.policymanagement.entities;

import org.springframework.stereotype.Component;

@Component
public class Address 
{
	
	private int address_id;
	private String city;
	private String address_line;
	private String state;
	private int pincode;
	
	
	public Address()
	{
		super();
	}
	
	
	
	public Address(int address_id, String city, String address_line, String state, int pincode) 
	{
		super();
		this.address_id = address_id;
		this.city = city;
		this.address_line = address_line;
		this.state = state;
		this.pincode = pincode;
	}
	

	public int getAddress_id() 
	{
		return address_id;
	}
	
	public void setAddress_id(int address_id) 
	{
		this.address_id = address_id;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getAddress_line() 
	{
		return address_line;
	}

	public void setAddress_line(String address_line) 
	{
		this.address_line = address_line;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public int getPincode() 
	{
		return pincode;
	}

	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	
	@Override
	public String toString() 
	{
		return "Address [address_id=" + address_id + ", city=" + city + ", address_line=" + address_line + ", state="
				+ state + ", pincode=" + pincode + "]";
	}




	
	
	
	
	
	

}
