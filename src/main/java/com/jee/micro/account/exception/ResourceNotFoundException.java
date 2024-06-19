package com.jee.micro.account.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String customer, String mobileNumber, String mobileNumber1) {
    }
}
