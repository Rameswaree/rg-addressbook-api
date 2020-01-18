package com.moo.addressbook.service;

import com.moo.addressbook.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookService{
     List<Customer> findByLastName(String lastName);

     List<Customer> findAll();
}
