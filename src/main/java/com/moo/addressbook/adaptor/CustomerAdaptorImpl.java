package com.moo.addressbook.adaptor;

import com.moo.addressbook.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Adaptor class to create customer list
 * @author rameswaree@gmail.com
 * Copyright 2020-2021
 */
@Component
public class CustomerAdaptorImpl implements CustomerAdaptor {

    /**
     *
     * @return list of customers with their addresses
     */
    @Override
    public List<Customer> createCustomerAddressList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,"David","Salter","6","EastBrook Hall","Leeds Road","","Bradford","UK","BD1 5AE"));
        customerList.add(new Customer(2,"David","Lerwill","6","EastBrook Hall","Leeds Road","","Bradford","UK","BD1 5AE"));
        customerList.add(new Customer(3,"Joanne","Brenton","7","Gatehaus","Chapel Street","","Leeds","UK","LS1 4PE"));
        customerList.add(new Customer(4,"Tim","Lerwill","8","Landmark","","","Halifax","UK","HX1 1AD"));
        customerList.add(new Customer(5,"Oliver","Brenton","8","Landmark","","","Halifax","UK","HX1 1AD"));
        customerList.add(new Customer(6,"Adam","Low","9","Broadway","Vicar Lane","","Skipton","UK","BD23 1EP"));
        customerList.add(new Customer(7,"Cathy","Salter","9","Broadway","Vicar Lane","","Skipton","UK","BD23 1EP"));
        customerList.add(new Customer(8,"Anton","Banks","10","Mazhar House","","","Manchester","UK","M1 1AJ"));
        customerList.add(new Customer(9,"Angela","Banks","11","The Balance","Key Drive","","Manchester","UK","M1 1AJ"));
        customerList.add(new Customer(10,"Elizabeth","Banks","12","Wellington House","","","London","UK","E1 7AE"));
        return customerList;
    }
}
