package com.hexaware.policymanagement.exception;

public class UserPolicyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserPolicyNotFoundException(String message) {
        super(message);
    }
}
