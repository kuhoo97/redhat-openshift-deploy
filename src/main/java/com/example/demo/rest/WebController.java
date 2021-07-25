package com.example.demo.rest;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
    private Environment environment;

    @Autowired
    public WebController(CustomerService customerService,Environment environment ) {

        this.customerService = customerService;
        this.environment= environment;
    }

    @GetMapping
    public ResponseEntity<String> getStatus()
    {
        return ResponseEntity.ok("user-service is up and running on port: "+environment.getProperty("local.server.port"));
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
