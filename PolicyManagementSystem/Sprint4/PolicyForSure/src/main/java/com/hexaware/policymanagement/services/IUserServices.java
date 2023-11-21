package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.dto.UserDTO;
import com.hexaware.policymanagement.entity.User;
/* Author:Devanshu
 * @CreatedOn:-14-11-2023
 * Description: User Service Interface
 */
public interface IUserServices 
{
	public User createUser(UserDTO userDTO);
	public User updateUser(UserDTO userDTO);
	public void deleteByUserId(long userId);
    public UserDTO getUserByEmail(String email);
    public List<User> getUserByUserType(String userType);
    public List<User> getUserByUserCategory(String userCategory);
    public User getUserByMobNo(String mobNo);



	
	public List<User> getAllUser();

}
