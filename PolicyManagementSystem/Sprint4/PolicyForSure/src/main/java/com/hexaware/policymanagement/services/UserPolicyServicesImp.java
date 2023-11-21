package com.hexaware.policymanagement.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.UserPolicyDTO;
import com.hexaware.policymanagement.entity.User;
import com.hexaware.policymanagement.entity.UserPolicy;
import com.hexaware.policymanagement.exception.UserPolicyNotFoundException;
import com.hexaware.policymanagement.repository.PolicyRepository;
import com.hexaware.policymanagement.repository.UserPolicyRepository;
import com.hexaware.policymanagement.repository.UserRepository;
/* Author:Devanshu
 * @CreatedOn:-14-11-2023
 * Description: UserPolicy Service Implementaion
 */
/* Author:Devanshu
 * @UpdatedOn:-16-11-2023
 * Description: Added Exception and logger
 */
@Service
public class UserPolicyServicesImp implements IUserPolicyServices {

    private static final Logger logger = LoggerFactory.getLogger(UserPolicyServicesImp.class);

    @Autowired
    UserPolicyRepository userpolicyrepo;
    
    @Autowired
    UserRepository userRepo;
    
    @Autowired
    PolicyRepository policyRepo;

    @Override
    public UserPolicy createUserPolicy(UserPolicyDTO userpolicyDTO) {
        try {
            UserPolicy userpolicy = new UserPolicy();
            userpolicy.setPolicyName(userpolicyDTO.getPolicyName());
            userpolicy.setPolicyType(userpolicyDTO.getPolicyType());
            userpolicy.setCompany(userpolicyDTO.getCompany());
            userpolicy.setStartDate(userpolicyDTO.getStartDate());
            userpolicy.setEndDate(userpolicyDTO.getEndDate());
            userpolicy.setAmount(userpolicyDTO.getAmount());
            userpolicy.setMaturityamount(userpolicyDTO.getMaturityamount());
            userpolicy.setPaymentInterval(userpolicyDTO.getPaymentInterval());
            userpolicy.setTenure(userpolicyDTO.getTenure());
            userpolicy.setUser(userpolicyDTO.getUser());
            userpolicy.setInterest(userpolicyDTO.getInterest());
 
            userpolicy.setPolicy(userpolicyDTO.getPolicy());

            UserPolicy createdUserPolicy = userpolicyrepo.save(userpolicy);

            logger.info("User Policy created successfully: {}", createdUserPolicy);

            return createdUserPolicy;
        } catch (Exception e) {
            logger.error("Error creating User Policy", e);
            throw new RuntimeException("Error creating User Policy", e);
        }
    }

    @Override
    public UserPolicy updateUserPolicy(UserPolicyDTO userpolicyDTO) {
        try {
            if (!userpolicyrepo.existsById(userpolicyDTO.getPolicyNo())) {
                throw new UserPolicyNotFoundException("User Policy not found with Policy No: " + userpolicyDTO.getPolicyNo());
            }

            UserPolicy userpolicy = new UserPolicy();
            userpolicy.setPolicyNo(userpolicyDTO.getPolicyNo());
            userpolicy.setPolicyName(userpolicyDTO.getPolicyName());
            userpolicy.setPolicyType(userpolicyDTO.getPolicyType());
            userpolicy.setCompany(userpolicyDTO.getCompany());
            userpolicy.setStartDate(userpolicyDTO.getStartDate());
            userpolicy.setEndDate(userpolicyDTO.getEndDate());
            userpolicy.setAmount(userpolicyDTO.getAmount());
            userpolicy.setMaturityamount(userpolicyDTO.getMaturityamount());
            userpolicy.setPaymentInterval(userpolicyDTO.getPaymentInterval());
            userpolicy.setTenure(userpolicyDTO.getTenure());
            userpolicy.setPolicy(userpolicyDTO.getPolicy());
            userpolicy.setUser(userpolicyDTO.getUser());
            
            userpolicy.setInterest(userpolicyDTO.getInterest());

            UserPolicy updatedUserPolicy = userpolicyrepo.save(userpolicy);

            logger.info("User Policy updated successfully: {}", updatedUserPolicy);

            return updatedUserPolicy;
        } catch (UserPolicyNotFoundException e) {
            logger.error("Error updating User Policy", e);
            throw e;
        } catch (Exception e) {
            logger.error("Error updating User Policy", e);
            throw new RuntimeException("Error updating User Policy", e);
        }
    }

    @Override
    public void deleteUserPolicyByPolicyNo(long policyNo) {
        try {
            if (!userpolicyrepo.existsById(policyNo)) {
                throw new UserPolicyNotFoundException("User Policy not found with Policy No: " + policyNo);
            }

            userpolicyrepo.deleteById(policyNo);

            logger.info("User Policy deleted successfully with Policy No: {}", policyNo);
        } catch (UserPolicyNotFoundException e) {
            logger.error("Error deleting User Policy", e);
            throw e;
        } catch (Exception e) {
            logger.error("Error deleting User Policy", e);
            throw new RuntimeException("Error deleting User Policy", e);
        }
    }

    @Override
    public UserPolicy getUserPolicyByPolicyNo(long policyNo) {
        try {
            UserPolicy userPolicy = userpolicyrepo.findById(policyNo).orElseThrow(
                    () -> new UserPolicyNotFoundException("User Policy not found with Policy No: " + policyNo));

            logger.info("User Policy retrieved successfully with Policy No: {}", policyNo);

            return userPolicy;
        } catch (UserPolicyNotFoundException e) {
            logger.error("Error getting User Policy by Policy No", e);
            throw e;
        } catch (Exception e) {
            logger.error("Error getting User Policy by Policy No", e);
            throw new RuntimeException("Error getting User Policy by Policy No", e);
        }
    }

    @Override
    public List<UserPolicy> getAllUserPolicy() {
        try {
            List<UserPolicy> userPolicies = userpolicyrepo.findAll();

            logger.info("Retrieved all User Policies successfully: {}", userPolicies);

            return userPolicies;
        } catch (Exception e) {
            logger.error("Error getting all User Policies", e);
            throw new RuntimeException("Error getting all User Policies", e);
        }
    }

	@Override
	public List<UserPolicy> getUserPolicyByUserId(User userId) {
		try {
            List<UserPolicy> userPolicy = userpolicyrepo.getUserPoliciesByUserId(userId);
            logger.info("User Policies retrieved successfully with User Id: {}", userId);

            return userPolicy;
        } catch (UserPolicyNotFoundException e) {
            logger.error("Error getting User Policy by User Id", e);
            throw e;
        } catch (Exception e) {
            logger.error("Error getting User Policy by User Id", e);
            throw new RuntimeException("Error getting User Policy by User Id", e);
        }
	}
}
