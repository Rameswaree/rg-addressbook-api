package com.moo.addressbook.service;

import com.moo.addressbook.model.Customer;

import java.util.List;

public interface AddressBookService {
    List<Customer> findByLastName(String lastName);

    List<Customer> findAll();
}
