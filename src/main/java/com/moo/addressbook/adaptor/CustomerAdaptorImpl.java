package com.moo.addressbook.adaptor;

import com.moo.addressbook.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Adaptor class to create customer list
 */
@Component
public class CustomerAdaptorImpl implements CustomerAdaptor {

    /**
     * @return list of customers with their addresses
     */
    @Override
    public List<Customer> createCustomerAddressList() {
        return List.of(
                createCustomer(1, "David", "Salter", "6", "EastBrook Hall", "Leeds Road", "", "Bradford", "UK", "BD1 5AE"),
                createCustomer(2, "David", "Lerwill", "6", "EastBrook Hall", "Leeds Road", "", "Bradford", "UK", "BD1 5AE"),
                createCustomer(3, "Joanne", "Brenton", "7", "Gatehaus", "Chapel Street", "", "Leeds", "UK", "LS1 4PE"),
                createCustomer(4, "Tim", "Lerwill", "8", "Landmark", "", "", "Halifax", "UK", "HX1 1AD"),
                createCustomer(5, "Oliver", "Brenton", "8", "Landmark", "", "", "Halifax", "UK", "HX1 1AD"),
                createCustomer(6, "Adam", "Low", "9", "Broadway", "Vicar Lane", "", "Skipton", "UK", "BD23 1EP"),
                createCustomer(7, "Cathy", "Salter", "9", "Broadway", "Vicar Lane", "", "Skipton", "UK", "BD23 1EP"),
                createCustomer(8, "Anton", "Banks", "10", "Mazhar House", "", "", "Manchester", "UK", "M1 1AJ"),
                createCustomer(9, "Angela", "Banks", "11", "The Balance", "Key Drive", "", "Manchester", "UK", "M1 1AJ"),
                createCustomer(10, "Elizabeth", "Banks", "12", "Wellington House", "", "", "London", "UK", "E1 7AE")
        );
    }

    private Customer createCustomer(long id, String firstName, String lastName, String houseNumber, String addressLine1, String addressLine2, String addressLine3, String city, String country, String postalCode) {
        return new Customer(id, firstName, lastName, houseNumber, addressLine1, addressLine2, addressLine3, city, country, postalCode);
    }
}
