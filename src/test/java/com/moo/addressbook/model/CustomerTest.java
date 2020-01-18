package com.moo.addressbook.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void init(){
        customer = new Customer();
    }

    @Test
    public void shouldReturnPostCode(){
        customer.setPostCode("BD1 5AE");
        String postCode = customer.getPostCode();

        assertEquals(postCode, "BD1 5AE");
    }

    @Test
    public void shouldReturnCustomerId(){
        customer.setCustomerId(1);
        long id = customer.getCustomerId();

        assertEquals(id, 1);
    }

    @Test
    public void shouldReturnFirstName(){
        customer.setFirstName("Reemu");
        String firstName = customer.getFirstName();

        assertEquals(firstName, "Reemu");
    }

    @Test
    public void shouldReturnLastName(){
        customer.setLastName("Ganesh");
        String lastName = customer.getLastName();

        assertEquals(lastName, "Ganesh");
    }

    @Test
    public void shouldReturnHouseNumber(){
        customer.setHouseNumber("6");
        String houseNumber = customer.getHouseNumber();

        assertEquals(houseNumber, "6");
    }

    @Test
    public void shouldReturnCity(){
        customer.setCity("Bradford");
        String city = customer.getCity();

        assertEquals(city, "Bradford");
    }

    @Test
    public void shouldReturnCountry(){
        customer.setCountry("United Kingdom");
        String country = customer.getCountry();

        assertEquals(country, "United Kingdom");
    }
}