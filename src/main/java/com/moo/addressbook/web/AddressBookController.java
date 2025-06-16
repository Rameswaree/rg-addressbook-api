package com.moo.addressbook.web;

import com.moo.addressbook.model.Customer;
import com.moo.addressbook.service.AddressBookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller class
 * @author rameswaree@gmail.com
 * Copyright 2020-2021
 */
@AllArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressBookController {

    private final AddressBookService addressBookService;

    /**
     *
     * @param lastName find customers by last name
     * @return list of customers having the last name passed as parameter(if provided),
     * otherwise returns all customers
     */
    @GetMapping
    public List<Customer> getCustomers(@RequestParam(required = false) String lastName) {

        if(lastName != null && !lastName.isEmpty()) {
            return addressBookService.findByLastName(lastName);
        }

        return addressBookService.findAll();
    }
}
