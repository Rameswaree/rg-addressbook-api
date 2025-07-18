package com.moo.addressbook.service;

import com.moo.addressbook.adaptor.CustomerAdaptor;
import com.moo.addressbook.exception.CustomerNotFoundException;
import com.moo.addressbook.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class to find the list of customers
 */
@Service
@AllArgsConstructor
public class AddressBookService {

    private final CustomerAdaptor customerAdaptor;

    /**
     * @param lastName Last name of the customer
     * @return list of customers having the value passed for lastName variable
     */
    public List<Customer> findByLastName(String lastName) {

        List<Customer> allCustomers = findAll();

        List<Customer> customers = allCustomers.stream()
                .filter(customer -> customer.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());

        if (customers.isEmpty()) {
            throw new CustomerNotFoundException("Unable to find address for the surname " + lastName);
        }

        return customers;
    }

    /**
     * @return list of all the customers present
     */
    public List<Customer> findAll() {
        return customerAdaptor.createCustomerAddressList();
    }
}
