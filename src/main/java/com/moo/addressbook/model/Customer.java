package com.moo.addressbook.model;


import lombok.*;

/**
 * Model class of Customer
 * @author rameswaree@gmail.com
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private long customerId;
    private String firstName;
    private String lastName;
    private String houseNumber;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
    private String postCode;
}
