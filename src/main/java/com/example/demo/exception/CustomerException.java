package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerException extends Exception{

    private static final long serialVersionUID= 1L;

    private String status;
    private String message;

    public CustomerException(String status, String message) {
        this.status = status;
        this.message = message;
    }



}
