package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User implements Serializable
{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int userId;
		private String fname;
		private String lname;
		private String password;
		private String email;
		private int mobNo;
		private String userType;
		private String userCategory;
		private Address address;
		private LocalDate dob;
		
		
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
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
		public int getMobNo() {
			return mobNo;
		}
		public void setMobNo(int mobNo) {
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
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		
		public User(int userId, String fname, String lname, String password, String email, int mobNo, String userType,
				String userCategory, Address address, LocalDate dob) {
			super();
			this.userId = userId;
			this.fname = fname;
			this.lname = lname;
			this.password = password;
			this.email = email;
			this.mobNo = mobNo;
			this.userType = userType;
			this.userCategory = userCategory;
			this.address = address;
			this.dob = dob;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", password=" + password
					+ ", email=" + email + ", mobNo=" + mobNo + ", userType=" + userType + ", userCategory="
					+ userCategory + ", address=" + address + ", dob=" + dob + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		


		
		


}
