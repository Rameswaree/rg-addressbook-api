package com.moo.addressbook.custom;

public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(String message) {
        System.out.println(message);
    }
}
