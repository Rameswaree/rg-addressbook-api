package com.moo.addressbook.web;

import com.moo.addressbook.custom.CustomerNotFoundException;
import com.moo.addressbook.model.Customer;
import com.moo.addressbook.service.AddressBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressBookController {

    static Logger logger = LoggerFactory.getLogger(AddressBookController.class);
    @Autowired
    AddressBookService addressBookService;

    @GetMapping("/address/{lastName}")
    public List<Customer> getCustomersByLastName(@PathVariable String lastName) throws CustomerNotFoundException {

        List<Customer> customerList = addressBookService.findByLastName(lastName);

        if(customerList.size()==0)
            throw new CustomerNotFoundException("Unable to find address for the surname "+ lastName);

        return customerList;
    }

    @GetMapping("/address")
    public List<Customer> getAllCustomers(){

        return addressBookService.findAll();
    }
}
