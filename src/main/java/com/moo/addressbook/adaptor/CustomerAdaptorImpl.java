package com.moo.addressbook.adaptor;

import com.moo.addressbook.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerAdaptorImpl implements CustomerAdaptor {

    private long id = 0;
    @Override
    public List<Customer> createCustomerAddressList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(incrementId(),"Reemu","Ganesh","6","EastBrook Hall","","","Bradford","UK","BD1 5AE"));
        customerList.add(new Customer(incrementId(),"Srikanth","Shekar","6","EastBrook Hall","","","Bradford","UK","BD1 5AE"));
        customerList.add(new Customer(incrementId(),"Mahesh","Shekar","7","Gatehaus","","","Leeds","UK","LS1 4PE"));
        customerList.add(new Customer(incrementId(),"Chandra","Shekar","8","Landmark","","","Halifax","UK","HX1 1AD"));
        customerList.add(new Customer(incrementId(),"Sivagamy","Viswa","8","Landmark","","","Halifax","UK","HX1 1AD"));
        customerList.add(new Customer(incrementId(),"Sarasa","Raman","9","Broadway","","","Skipton","UK","BD23 1EP"));
        customerList.add(new Customer(incrementId(),"Gachu","Thyagu","9","Broadway","","","Skipton","UK","BD23 1EP"));
        customerList.add(new Customer(incrementId(),"Padma","Ganapathy","10","EastBrook Hall","","","Manchester","UK","M1 1AJ"));
        customerList.add(new Customer(incrementId(),"Rajan","Swamy","11","EastBrook Hall","","","Manchester","UK","M1 1AJ"));
        customerList.add(new Customer(incrementId(),"Krishna","Venkat","12","EastBrook Hall","","","London","UK","E1 7AE"));
        return customerList;
    }

    private long incrementId(){
        return id++;
    }
}
