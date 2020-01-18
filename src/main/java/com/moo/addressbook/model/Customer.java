package com.moo.addressbook.model;

import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.ToStringBuilder;

public class Customer {

    long customerId;
    String firstName;
    String lastName;
    String houseNumber;
    String addressLine1;
    String addressLine2;
    String addressLine3;
    String city;
    String country;
    String postCode;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        return equalsBuilder
                .append(customerId, customer.getCustomerId())
                .append(firstName, customer.getFirstName())
                .append(lastName, customer.getLastName())
                .append(houseNumber, customer.getHouseNumber())
                .append(addressLine1, customer.getAddressLine1())
                .append(addressLine2, customer.getAddressLine2())
                .append(addressLine3, customer.getAddressLine3())
                .append(city, customer.getCity())
                .append(country, customer.getCountry())
                .append(postCode, customer.getPostCode())
                .isEquals();
    }

    @Override
    public int hashCode() {

        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        return hashCodeBuilder
                .append(customerId)
                .append(firstName)
                .append(lastName)
                .append(houseNumber)
                .append(addressLine1)
                .append(addressLine2)
                .append(addressLine3)
                .append(city)
                .append(country)
                .append(postCode)
                .toHashCode();
    }

    @Override
    public String toString() {

        ToStringBuilder toStringBuilder = new ToStringBuilder(this);
        return toStringBuilder
                .append("customerId", customerId)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("houseNumber", houseNumber)
                .append("addressLine1", addressLine1)
                .append("addressLine2", addressLine2)
                .append("addressLine3", addressLine3)
                .append("city", city)
                .append("country", country)
                .append("postCode", postCode)
                .toString();
    }
}
