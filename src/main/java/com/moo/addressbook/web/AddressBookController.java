package com.moo.addressbook.web;

import com.moo.addressbook.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressBookController {

    @GetMapping("/address/{lastName}")
    public List<Customer> getCustomersByLastName(@PathVariable String lastName){
        return null;
    }
}
