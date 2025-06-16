package com.moo.addressbook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CustomExceptionError handleCustomerNotFoundException(CustomerNotFoundException ex) {
        return CustomExceptionError.builder()
                .status(HttpStatus.NOT_FOUND)
                .message(ex.getMessage())
                .build();
    }
}
