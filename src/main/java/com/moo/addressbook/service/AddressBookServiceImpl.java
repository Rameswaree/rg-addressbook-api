package com.moo.addressbook.service;

import com.moo.addressbook.adaptor.CustomerAdaptor;
import com.moo.addressbook.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class to find the list of customers
 * @author rameswaree@gmail.com
 * Copyright 2020-2021
 */
@Service
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    CustomerAdaptor customerAdaptor;

    public AddressBookServiceImpl(CustomerAdaptor customerAdaptor) {
        this.customerAdaptor = customerAdaptor;
    }

    /**
     *
     * @param lastName
     * @return list of customers having the value passed for lastName variable
     */
    @Override
    public List<Customer> findByLastName(String lastName) {

        List<Customer> customerStream = customerAdaptor.createCustomerAddressList();
        return customerStream.stream().filter(c->c.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
    }

    /**
     *
     * @return list of all the customers present
     */
    @Override
    public List<Customer> findAll() {
        return customerAdaptor.createCustomerAddressList();
    }
}
