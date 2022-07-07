package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.model.Customer;
import com.springrest.repositories.CustomerRepo;

@Service

public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public List<Customer> getAllCustomer(){
        final List<Customer> customerList = new ArrayList<>();

       customerRepo.findAll().forEach(customerList::add);
        return  customerList;
    }

    public Customer getCustomerById(int id){
      return  customerRepo.findById(id).get();
    }

    public Customer addCustomer(Customer cust){
        return customerRepo.save(cust);
    }

    public boolean deleteCustomer(int id){
         customerRepo.deleteById(id);
         return true;
    }
  public Customer updateEmployee(Customer cust){
        return customerRepo.save(cust);
  }

}