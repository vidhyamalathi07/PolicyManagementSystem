package com.hexaware.policymanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.User;
/* Author:Devanshu
 * @CreatedOn:-14-11-2023
 * Description: User Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
	Optional<User> findByFname(String fname);
	
	public List<User> findByUserType(String userType);
	
	public User findByMobNo(String mobNo);
	
	public List<User> findByUserCategory(String userCategory);
	
	public User findByEmail(String email);

}
