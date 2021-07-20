package com.example.demo.rest;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    private CustomerService customerService;

    @Autowired
    public WebController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @PostMapping("/users")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.saveCustomer(customer));

    }

    @GetMapping("/users")
    public ResponseEntity<List<Customer>> retrieveCustomer()
    {
        return ResponseEntity.ok(customerService.retrieveCustomers());
    }

}
