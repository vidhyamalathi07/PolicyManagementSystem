package com.hexaware.policymanagement.exception;

public class UserNotFoundException extends RuntimeException 
{

    public UserNotFoundException(String message) 
    {
        super(message);
    }
}
