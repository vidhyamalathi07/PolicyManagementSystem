package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entity.User;

public interface IUserServices 
{
	public User createUser(User user);
	public User updateUser(User user);
	public User deleteUser(User user);
	public List<User> getUserByFname(String fname);
    public User getUserByEmail(String email);
    public List<User> getUserByUserType(String userType);
    public List<User> getUserByUserCategory(String userCategory);



	
	public List<User> getAllUser();

}
