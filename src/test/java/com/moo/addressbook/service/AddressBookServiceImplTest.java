package com.moo.addressbook.service;

import com.moo.addressbook.adaptor.CustomerAdaptor;
import com.moo.addressbook.adaptor.CustomerAdaptorImpl;
import com.moo.addressbook.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
public class AddressBookServiceImplTest {

    AddressBookService addressBookService;

    CustomerAdaptor customerAdaptor;

    @Before
    public void init(){
        customerAdaptor = new CustomerAdaptorImpl();
        addressBookService = new AddressBookServiceImpl(customerAdaptor);
    }

    @Test
    public void shouldReturnCustomerList(){
        List<Customer> customerList = addressBookService.findAll();

        assertThat(customerList.size(), is(10));
    }

    @Test
    public void shouldReturnCustomerListByFindingLastName(){
        List<Customer> customerList = addressBookService.findByLastName("Nicolan");

        assertThat(customerList.size(), is(1));
    }

    @Test
    public void shouldReturnListSizeZeroWhileFindingLastName(){
        List<Customer> customerList = addressBookService.findByLastName("Ganesh");

        assertThat(customerList.size(), is(0));
    }
}