package com.hexaware.policymanagement.entities;

import java.time.LocalDate;

public class User 
{

	
		private int user_id;
		private String fname;
		private String lname;
		private String pwd;
		//private String email;
		private int mob_no;
		private String user_type;
		private String user_category;
		private Address address;
		private LocalDate dob;
		
		
		
		public User() 
		{
			super();
		}


		public User(int user_id, String fname, String lname, String pwd, int mob_no, String user_type,
				String user_category, Address address, LocalDate dob) 
		{
			super();
			this.user_id = user_id;
			this.fname = fname;
			this.lname = lname;
			this.pwd = pwd;
			this.mob_no = mob_no;
			this.user_type = user_type;
			this.user_category = user_category;
			this.address = address;
			this.dob = dob;
		}
		
		
		public int getUser_id() 
		{
			return user_id;
		}
		public void setUser_id(int user_id) 
		{
			this.user_id = user_id;
		}
		public String getFname() 
		{
			return fname;
		}
		public void setFname(String fname) 
		{
			this.fname = fname;
		}
		public String getLname() 
		{
			return lname;
		}
		public void setLname(String lname) 
		{
			this.lname = lname;
		}
		public String getPwd() 
		{
			return pwd;
		}
		public void setPwd(String pwd) 
		{
			this.pwd = pwd;
		}
		public int getMob_no() 
		{
			return mob_no;
		}
		public void setMob_no(int mob_no) 
		{
			this.mob_no = mob_no;
		}
		public String getUser_type() 
		{
			return user_type;
		}
		public void setUser_type(String user_type) 
		{
			this.user_type = user_type;
		}
		public String getUser_category() 
		{
			return user_category;
		}
		public void setUser_category(String user_category) 
		{
			this.user_category = user_category;
		}
		public Address getAddress_id() 
		{
			return address;
		}
		public void setAddress_id(Address address) 
		{
			this.address = address;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}


		@Override
		public String toString() 
		{
			return "User [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", pwd=" + pwd + ", mob_no="
					+ mob_no + ", user_type=" + user_type + ", user_category=" + user_category + ", address="
					+ address + "]";
		}
		
		
		


		
		


}
