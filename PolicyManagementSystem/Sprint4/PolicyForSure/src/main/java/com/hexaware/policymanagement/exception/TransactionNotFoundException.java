package com.hexaware.policymanagement.exception;
/* Author:Devanshu
 * @CreatedOn:-17-11-2023
 * Description: User Defined exception 
 */
public class TransactionNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TransactionNotFoundException(String message) {
        super(message);
    }
}
