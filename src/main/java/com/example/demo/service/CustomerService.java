package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer saveCustomer(Customer customer);
    public List<Customer> retrieveCustomers();
}
