package com.moo.addressbook.service;

import com.moo.addressbook.adaptor.CustomerAdaptor;
import com.moo.addressbook.adaptor.CustomerAdaptorImpl;
import com.moo.addressbook.exception.CustomerNotFoundException;
import com.moo.addressbook.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddressBookServiceImplTest {

    AddressBookService addressBookService;

    CustomerAdaptor customerAdaptor;

    @BeforeEach
    public void init(){
        customerAdaptor = new CustomerAdaptorImpl();
        addressBookService = new AddressBookServiceImpl(customerAdaptor);
    }

    @Test
    public void shouldReturnCustomerList(){
        List<Customer> customerList = addressBookService.findAll();

        assertEquals(10, customerList.size());
    }

    @Test
    public void shouldReturnCustomerListByFindingLastName(){
        List<Customer> customerList = addressBookService.findByLastName("Low");

        assertEquals(1, customerList.size());
    }

    @Test
    public void shouldThrowExceptionWhileFindingLastName(){
        CustomerNotFoundException customerNotFoundException = assertThrows(CustomerNotFoundException.class, () -> addressBookService.findByLastName("Ganesh"));

        assertEquals("Unable to find address for the surname Ganesh", customerNotFoundException.getMessage());
    }
}