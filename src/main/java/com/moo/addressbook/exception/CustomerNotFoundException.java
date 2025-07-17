package com.moo.addressbook.exception;

/**
 * Class to define customised exception for when a customer is not found.
 */
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
