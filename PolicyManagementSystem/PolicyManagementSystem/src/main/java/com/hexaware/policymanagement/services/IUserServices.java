package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.dto.UserDTO;
import com.hexaware.policymanagement.entity.User;

public interface IUserServices 
{
	public User createUser(UserDTO userDTO);
	public User updateUser(UserDTO userDTO);
	public void deleteByUserId(long userId);
	public List<User> getUserByFname(String fname);
    public User getUserByEmail(String email);
    public List<User> getUserByUserType(String userType);
    public List<User> getUserByUserCategory(String userCategory);
    public User getUserByMobNo(String MobNo);



	
	public List<User> getAllUser();

}
