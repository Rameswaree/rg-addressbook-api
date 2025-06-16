package com.moo.addressbook.custom;

/**
 * Class to define customised exception
 * @author rameswaree@gmail.com
 * Copyright 2020-2021
 */
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
