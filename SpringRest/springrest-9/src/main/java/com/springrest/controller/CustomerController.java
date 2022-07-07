package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Customer;
import com.springrest.service.CustomerService;
@CrossOrigin(origins = "http://localhost:8083")
@RequestMapping("/api")
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping( "/customer")
    public List<Customer> getAllDetails(){
       List<Customer> customerList= customerService.getAllCustomer();
       return customerList;
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer/add")
    public Customer addCustomer(@RequestBody Customer cust){
        return customerService.addCustomer(cust);

    }

    @DeleteMapping("/customer/{id}")
    public boolean deleteCustomer(@PathVariable("id") int id){
        return customerService.deleteCustomer(id);

    }

    @PutMapping(  "/customer/update")
    public Customer updateEmployee(@RequestBody Customer cust){
        return customerService.updateEmployee(cust);
    }
}
