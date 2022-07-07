package com.springrest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product,String> {
}
