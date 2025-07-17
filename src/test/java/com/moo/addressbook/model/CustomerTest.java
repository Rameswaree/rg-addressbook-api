package com.moo.addressbook.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void init() {
        customer = new Customer();
    }

    @Test
    public void shouldReturnPostCode() {
        customer.setPostCode("BD1 5AE");
        String postCode = customer.getPostCode();

        assertEquals("BD1 5AE", postCode);
    }

    @Test
    public void shouldReturnCustomerId() {
        customer.setCustomerId(1);
        long id = customer.getCustomerId();

        assertEquals(1, id);
    }

    @Test
    public void shouldReturnFirstName() {
        customer.setFirstName("Reemu");
        String firstName = customer.getFirstName();

        assertEquals("Reemu", firstName);
    }

    @Test
    public void shouldReturnLastName() {
        customer.setLastName("Ganesh");
        String lastName = customer.getLastName();

        assertEquals("Ganesh", lastName);
    }

    @Test
    public void shouldReturnHouseNumber() {
        customer.setHouseNumber("6");
        String houseNumber = customer.getHouseNumber();

        assertEquals("6", houseNumber);
    }

    @Test
    public void shouldReturnCity() {
        customer.setCity("Bradford");
        String city = customer.getCity();

        assertEquals("Bradford", city);
    }

    @Test
    public void shouldReturnCountry() {
        customer.setCountry("United Kingdom");
        String country = customer.getCountry();

        assertEquals("United Kingdom", country);
    }
}