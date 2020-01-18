package com.moo.addressbook.repository;

import com.moo.addressbook.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository{
     List<Customer> findByLastName(String lastName);
}
