package com.moo.addressbook.adaptor;

import com.moo.addressbook.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerAdaptorImpl implements CustomerAdaptor {

    @Override
    public List<Customer> createCustomerAddressList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Reemu","Ganesh","6","EastBrook Hall","","","Bradford","UK","BD1 5AE"));
        customerList.add(new Customer(2,"Srikanth","Shekar","6","EastBrook Hall","","","Bradford","UK","BD1 5AE"));
        customerList.add(new Customer(3,"Mahesh","Shekar","7","Gatehaus","","","Leeds","UK","LS1 4PE"));
        customerList.add(new Customer(4,"Chandra","Shekar","8","Landmark","","","Halifax","UK","HX1 1AD"));
        customerList.add(new Customer(5,"Sivagamy","Viswa","8","Landmark","","","Halifax","UK","HX1 1AD"));
        customerList.add(new Customer(6,"Sarasa","Raman","9","Broadway","","","Skipton","UK","BD23 1EP"));
        customerList.add(new Customer(7,"Gachu","Thyagu","9","Broadway","","","Skipton","UK","BD23 1EP"));
        customerList.add(new Customer(8,"Padma","Ganapathy","10","EastBrook Hall","","","Manchester","UK","M1 1AJ"));
        customerList.add(new Customer(9,"Rajan","Swamy","11","EastBrook Hall","","","Manchester","UK","M1 1AJ"));
        customerList.add(new Customer(10,"Krishna","Venkat","12","EastBrook Hall","","","London","UK","E1 7AE"));
        return customerList;
    }
}
