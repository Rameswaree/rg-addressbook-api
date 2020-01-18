package com.moo.addressbook.service;

import com.moo.addressbook.adaptor.CustomerAdaptor;
import com.moo.addressbook.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    CustomerAdaptor customerAdaptor;

    public AddressBookServiceImpl(CustomerAdaptor customerAdaptor) {
        this.customerAdaptor = customerAdaptor;
    }

    @Override
    public List<Customer> findByLastName(String lastName) {

        List<Customer> customerStream = customerAdaptor.createCustomerAddressList();
        return customerStream.stream().filter(c->c.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
    }

    @Override
    public List<Customer> findAll() {
        return customerAdaptor.createCustomerAddressList();
    }
}
