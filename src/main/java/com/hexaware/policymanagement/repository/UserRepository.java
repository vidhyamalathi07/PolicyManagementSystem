package com.hexaware.policymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
	public List<User> findByFname(String fname);
	
	public List<User> findByUserType(String userType);
	
	public User findByMobNo(String mobNo);
	
	public List<User> findByUserCategory(String userCategory);
	
	public User findByEmail(String email);

}
