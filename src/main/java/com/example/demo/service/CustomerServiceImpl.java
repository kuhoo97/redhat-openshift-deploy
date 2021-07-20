package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

   private CustomerRepository repo;

   @Autowired
    public CustomerServiceImpl(CustomerRepository repo)
   {
        this.repo = repo;
    }

    @Override
    public Customer saveCustomer(Customer customer) {

       return repo.save(customer);
    }

    @Override
    public List<Customer> retrieveCustomers() {

       return repo.findAll();
    }
}
