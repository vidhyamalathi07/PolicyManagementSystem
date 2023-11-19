package com.hexaware.policymanagement.services;

import java.time.LocalDate;
import java.util.List;

import com.hexaware.policymanagement.entities.Address;
import com.hexaware.policymanagement.entities.User;

public interface IUserServices 
{
	public boolean createUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	
    public User getUserById(int user_id);
	
	public List<User> getAllUser();

}
