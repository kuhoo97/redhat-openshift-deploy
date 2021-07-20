package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
    private Double salary;



}
