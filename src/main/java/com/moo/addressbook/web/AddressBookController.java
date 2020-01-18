package com.moo.addressbook.web;

import com.moo.addressbook.model.Customer;
import com.moo.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping("/address/{lastName}")
    public List<Customer> getCustomersByLastName(@PathVariable String lastName){
        return addressBookService.retrieveCustomersByLastName(lastName);
    }
}
