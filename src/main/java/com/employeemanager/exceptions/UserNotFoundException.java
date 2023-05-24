package com.employeemanager.exceptions;

/**
 * @author Ivan Gordeev 24.05.2023
 */

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
