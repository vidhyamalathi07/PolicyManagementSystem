package com.hexaware.policymanagement.exception;

public class DuplicateUserException extends RuntimeException 
{

    public DuplicateUserException(String message) 
    {
        super(message);
    }
}
