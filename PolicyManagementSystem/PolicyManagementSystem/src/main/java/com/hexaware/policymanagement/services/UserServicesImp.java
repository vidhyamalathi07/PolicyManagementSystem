package com.hexaware.policymanagement.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.UserDTO;
import com.hexaware.policymanagement.entity.User;
import com.hexaware.policymanagement.exception.DuplicateUserException;
import com.hexaware.policymanagement.exception.UserNotFoundException;
import com.hexaware.policymanagement.repository.UserRepository;

@Service
public class UserServicesImp implements IUserServices {

	private static final Logger logger = LoggerFactory.getLogger(UserServicesImp.class);

	@Autowired
	UserRepository userRepo;

	@Override
	public User createUser(UserDTO userDTO) 
	{
		try 
		{
			User existingUserEmail = userRepo.findByEmail(userDTO.getEmail());
        if (existingUserEmail != null) 
        {
            throw new DuplicateUserException("User with email " + userDTO.getEmail() + " already exists");
        }
        
        
        	User existingUserMobNo = userRepo.findByMobNo(userDTO.getMobNo());
        if (existingUserMobNo != null) 
        {
            throw new DuplicateUserException("User with Mobile No " + userDTO.getMobNo() + " already exists");
        }
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
			user.setPanNumber(userDTO.getPanNumber());
			user.setEmployerName(userDTO.getEmployerName());
			user.setEmployerType(userDTO.getEmployerType());

			User createdUser = userRepo.save(user);

			logger.info("User created successfully: {}", createdUser);

			return createdUser;
		} 
		catch (Exception e) 
		{
			logger.error("Error creating user", e);
			throw new RuntimeException("Error creating user", e);
		}
	}

	@Override
	public User updateUser(UserDTO userDTO) 
	{
		try 
		{
			if (!userRepo.existsById(userDTO.getUserId())) 
			{
				throw new UserNotFoundException("User not found with ID: " + userDTO.getUserId());
			}

			User user = new User();
			user.setUserId(userDTO.getUserId());
			user.setFname(userDTO.getFname());
			user.setLname(userDTO.getLname());
			user.setEmail(userDTO.getEmail());
			user.setMobNo(userDTO.getMobNo());
			user.setUserCategory(userDTO.getUserCategory());
			user.setUserType(userDTO.getUserType());
			user.setDob(userDTO.getDob());
			user.setPassword(userDTO.getPassword());
			user.setAddress(userDTO.getAddress());
			user.setPanNumber(userDTO.getPanNumber());
			user.setEmployerName(userDTO.getEmployerName());
			user.setEmployerType(userDTO.getEmployerType());

			User updatedUser = userRepo.save(user);

			logger.info("User updated successfully: {}", updatedUser);

			return updatedUser;
		} 
		catch (Exception e) 
		{
			logger.error("Error updating user", e);
			throw new RuntimeException("Error updating user", e);
		}
	}

	@Override
	public void deleteByUserId(long userId) 
	{
		try 
		{
			if (!userRepo.existsById(userId)) 
			{
				throw new UserNotFoundException("User not found with ID: " + userId);
			}

			userRepo.deleteById(userId);

			logger.info("User deleted successfully with ID: {}", userId);
		} 
		catch (Exception e) 
		{
			logger.error("Error deleting user", e);
			throw new RuntimeException("Error deleting user", e);
		}
	}

	@Override
	public User getUserByEmail(String email) 
	{
		try {
			User user = userRepo.findByEmail(email);

			if (user == null) 
			{
				throw new UserNotFoundException("User not found with email: " + email);
			}

			logger.info("User retrieved successfully by email: {}", user);

			return user;
		} 
		catch (Exception e) 
		{
			logger.error("Error getting user by email", e);
			throw new RuntimeException("Error getting user by email", e);
		}
	}

	@Override
	public User getUserByMobNo(String mobNo) 
	{
		try 
		{
			User user = userRepo.findByMobNo(mobNo);

			if (user == null) 
			{
				throw new UserNotFoundException("User not found with mobile number: " + mobNo);
			}

			logger.info("User retrieved successfully by mobile number: {}", user);

			return user;
		} 
		catch (Exception e) 
		{
			logger.error("Error getting user by mobile number", e);
			throw new RuntimeException("Error getting user by mobile number", e);
		}
	}

	@Override
	public List<User> getAllUser() 
	{
		try 
		{
			List<User> users = userRepo.findAll();

			logger.info("Retrieved all users successfully: {}", users);

			return users;
		} 
		catch (Exception e) 
		{
			logger.error("Error getting all users", e);
			throw new RuntimeException("Error getting all users", e);
		}
	}

	@Override
	public List<User> getUserByFname(String fname) 
	{
		try 
		{
			List<User> users = userRepo.findByFname(fname);

			logger.info("Retrieved users by first name '{}' successfully: {}", fname, users);

			return users;
		}
		catch (Exception e) 
		{
			logger.error("Error getting users by first name", e);
			throw new RuntimeException("Error getting users by first name", e);
		}
	}

	@Override
	public List<User> getUserByUserType(String userType) 
	{
		try 
		{
			List<User> users = userRepo.findByUserType(userType);

			logger.info("Retrieved users by user type '{}' successfully: {}", userType, users);

			return users;
		} 
		catch (Exception e) 
		{
			logger.error("Error getting users by user type", e);
			throw new RuntimeException("Error getting users by user type", e);
		}
	}

	@Override
	public List<User> getUserByUserCategory(String userCategory) 
	{
		try 
		{
			List<User> users = userRepo.findByUserCategory(userCategory);

			logger.info("Retrieved users by user category '{}' successfully: {}", userCategory, users);

			return users;
		} 
		catch (Exception e) 
		{
			logger.error("Error getting users by user category", e);
			throw new RuntimeException("Error getting users by user category", e);
		}
	}
}
