package com.hexaware.policymanagement.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.PolicyDTO;
import com.hexaware.policymanagement.entity.Policy;
import com.hexaware.policymanagement.exception.PolicyNotFoundException;
import com.hexaware.policymanagement.repository.PolicyRepository;

@Service
public class PolicyServicesImp implements IPolicyServices {

    private static final Logger logger = LoggerFactory.getLogger(PolicyServicesImp.class);

    @Autowired
    PolicyRepository policyrepo;

    @Override
    public Policy createPolicy(PolicyDTO policyDTO) 
    {
        try 
        {
            Policy policy = new Policy();
            policy.setPolicyName(policyDTO.getPolicyName());
            policy.setPolicyType(policyDTO.getPolicyType());
            policy.setAmount(policyDTO.getAmount());
            policy.setCompany(policyDTO.getCompany());
            policy.setMaturityAmount(policyDTO.getMaturityAmount());
            policy.setPolicyDescription(policyDTO.getPolicyDescription());
            policy.setTenure(policyDTO.getTenure());

            Policy createdPolicy = policyrepo.save(policy);

            logger.info("Policy created successfully: {}", createdPolicy);

            return createdPolicy;
        } 
        catch (Exception e) 
        {
            logger.error("Error creating Policy", e);
            throw new RuntimeException("Error creating Policy", e);
        }
    }

    @Override
    public Policy updatePolicy(PolicyDTO policyDTO) {
        try 
        {
            if (!policyrepo.existsById(policyDTO.getPolicyId())) 
            {
                throw new PolicyNotFoundException("Policy not found with ID: " + policyDTO.getPolicyId());
            }

            Policy policy = new Policy();
            policy.setPolicyId(policyDTO.getPolicyId());
            policy.setPolicyName(policyDTO.getPolicyName());
            policy.setPolicyType(policyDTO.getPolicyType());
            policy.setAmount(policyDTO.getAmount());
            policy.setCompany(policyDTO.getCompany());
            policy.setMaturityAmount(policyDTO.getMaturityAmount());
            policy.setPolicyDescription(policyDTO.getPolicyDescription());
            policy.setTenure(policyDTO.getTenure());

            Policy updatedPolicy = policyrepo.save(policy);

            logger.info("Policy updated successfully: {}", updatedPolicy);

            return updatedPolicy;
        } 
        catch (PolicyNotFoundException e) 
        {
            logger.error("Error updating Policy", e);
            throw e;
        } 
        catch (Exception e) 
        {
            logger.error("Error updating Policy", e);
            throw new RuntimeException("Error updating Policy", e);
        }
    }

    @Override
    public void deleteByPolicyId(long policyId) 
    {
        try 
        {
            if (!policyrepo.existsById(policyId)) 
            {
                throw new PolicyNotFoundException("Policy not found with ID: " + policyId);
            }

            policyrepo.deleteById(policyId);

            logger.info("Policy deleted successfully with ID: {}", policyId);
        } 
        catch (PolicyNotFoundException e) 
        {
            logger.error("Error deleting Policy", e);
            throw e;
        } 
        catch (Exception e) 
        {
            logger.error("Error deleting Policy", e);
            throw new RuntimeException("Error deleting Policy", e);
        }
    }

    @Override
    public List<Policy> getPolicyByPolicyType(String policyType) 
    {
        try 
        {
            List<Policy> policies = policyrepo.findByPolicyType(policyType);

            logger.info("Retrieved Policies by Policy Type successfully: {}", policies);

            return policies;
        } 
        catch (Exception e) 
        {
            logger.error("Error getting Policies by Policy Type", e);
            throw new RuntimeException("Error getting Policies by Policy Type", e);
        }
    }

    @Override
    public List<Policy> getPolicyByCompany(String company) 
    {
        try 
        {
            List<Policy> policies = policyrepo.findByCompany(company);

            logger.info("Retrieved Policies by Company successfully: {}", policies);

            return policies;
        } 
        catch (Exception e) 
        {
            logger.error("Error getting Policies by Company", e);
            throw new RuntimeException("Error getting Policies by Company", e);
        }
    }

    @Override
    public List<Policy> getAllPolicy() 
    {
        try 
        {
            List<Policy> policies = policyrepo.findAll();

            logger.info("Retrieved all Policies successfully: {}", policies);

            return policies;
        } 
        catch (Exception e) 
        {
            logger.error("Error getting all Policies", e);
            throw new RuntimeException("Error getting all Policies", e);
        }
    }

    @Override
    public List<Policy> getByPremiumLessThan(double premium) 
    {
        try 
        {
            List<Policy> policies = policyrepo.findByPremiumLessThan(premium);

            logger.info("Retrieved Policies by Premium Less Than successfully: {}", policies);

            return policies;
        } 
        catch (Exception e) 
        {
            logger.error("Error getting Policies by Premium Less Than", e);
            throw new RuntimeException("Error getting Policies by Premium Less Than", e);
        }
    }

    @Override
    public List<Policy> getByPremiumGreaterThan(double premium) 
    {
        try 
        {
            List<Policy> policies = policyrepo.findByPremiumGreaterThan(premium);

            logger.info("Retrieved Policies by Premium Greater Than successfully: {}", policies);

            return policies;
        } 
        catch (Exception e) 
        {
            logger.error("Error getting Policies by Premium Greater Than", e);
            throw new RuntimeException("Error getting Policies by Premium Greater Than", e);
        }
    }
}
