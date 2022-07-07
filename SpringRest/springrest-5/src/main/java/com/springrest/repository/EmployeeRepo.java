package com.springrest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.springrest.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
