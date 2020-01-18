CREATE TABLE customer
(
    customerId integer not null,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    houseNumber varchar(25) not null,
    addressLine1 varchar(255) not null,
    addressLine2 varchar(255),
    addressLine3 varchar(255),
    city varchar(100) not null,
    country varchar(100) not null,
    postCode varchar(15) not null
);