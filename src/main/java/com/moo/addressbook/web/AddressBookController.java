package com.moo.addressbook.web;

import com.moo.addressbook.custom.CustomerNotFoundException;
import com.moo.addressbook.model.Customer;
import com.moo.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller class
 * @author rameswaree@gmail.com
 * Copyright 2020-2021
 */
@RestController
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    /**
     *
     * @param lastName find customers by last name
     * @return list of customers having the last name passed as parameter
     * @throws CustomerNotFoundException when the last name is not available in the list
     */
    @GetMapping("/address/{lastName}")
    public List<Customer> getCustomersByLastName(@PathVariable String lastName) throws CustomerNotFoundException {

        List<Customer> customerList = addressBookService.findByLastName(lastName);

        if(customerList.size()==0)
            throw new CustomerNotFoundException("Unable to find address for the surname "+ lastName);

        return customerList;
    }

    /**
     *
     * @return list of all customers
     */
    @GetMapping("/address")
    public List<Customer> getAllCustomers(){

        return addressBookService.findAll();
    }
}
