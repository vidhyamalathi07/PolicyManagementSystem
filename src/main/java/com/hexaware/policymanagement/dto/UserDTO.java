package com.hexaware.policymanagement.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.hexaware.policymanagement.entity.Address;
import com.hexaware.policymanagement.entity.UserPolicy;


public class UserDTO 
{

	private long userId;
	private String fname;
	private String lname;
	private String password;
	private String email;
	private String mobNo;
	private String userType;
	private String userCategory;
	private LocalDate dob;
	
	private Address address;
	
	private Set<UserPolicy> users = new HashSet<>();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<UserPolicy> getUsers() {
		return users;
	}

	public void setUsers(Set<UserPolicy> users) {
		this.users = users;
	}

	public UserDTO(long userId, String fname, String lname, String password, String email, String mobNo,
			String userType, String userCategory, LocalDate dob, Address address, Set<UserPolicy> users) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.email = email;
		this.mobNo = mobNo;
		this.userType = userType;
		this.userCategory = userCategory;
		this.dob = dob;
		this.address = address;
		this.users = users;
	}

	public UserDTO() {
		super();
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", password=" + password
				+ ", email=" + email + ", mobNo=" + mobNo + ", userType=" + userType + ", userCategory=" + userCategory
				+ ", dob=" + dob + ", address=" + address + ", users=" + users + "]";
	}
	
	
	
		
		
		
		
		
		
		
		
		
		
		


		
		


}
