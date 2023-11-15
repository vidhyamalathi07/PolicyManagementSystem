package com.hexaware.policymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.policymanagement.dto.UserDTO;
import com.hexaware.policymanagement.entity.User;
import com.hexaware.policymanagement.repository.UserRepository;

public class UserServicesImp implements IUserServices {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User createUser(UserDTO userDTO) {
		User user = new User();
		user.setFname(userDTO.getFname());
		user.setLname(userDTO.getLname());
		user.setEmail(userDTO.getEmail());
		user.setMobNo(userDTO.getMobNo());
		user.setUserCategory(userDTO.getUserCategory());
		user.setUserType(userDTO.getUserType());
		user.setDob(userDTO.getDob());
		user.setPassword(userDTO.getPassword());
		user.setAddress(userDTO.getAddress());
		
		
		return userRepo.save(user);
	}

	@Override
	public User updateUser(UserDTO userDTO) {
		User user = new User();
		user.setUserId(userDTO.getUserId());;
		user.setFname(userDTO.getFname());
		user.setLname(userDTO.getLname());
		user.setEmail(userDTO.getEmail());
		user.setMobNo(userDTO.getMobNo());
		user.setUserCategory(userDTO.getUserCategory());
		user.setUserType(userDTO.getUserType());
		user.setDob(userDTO.getDob());
		user.setPassword(userDTO.getPassword());
		user.setAddress(userDTO.getAddress());
		
		
		return userRepo.save(user);
	}

	@Override
	public void deleteByUserId(long userId) {
		userRepo.deleteById(userId);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public User getUserByMobNo(String MobNo) {
		
		return userRepo.findByMobNo(MobNo);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public List<User> getUserByFname(String fname) {
		return userRepo.findByFname(fname);
	}

	@Override
	public List<User> getUserByUserType(String userType) {
		return userRepo.findByUserType(userType);
	}

	@Override
	public List<User> getUserByUserCategory(String userCategory) {
		return userRepo.findByUserCategory(userCategory);
	}

	
	
}
