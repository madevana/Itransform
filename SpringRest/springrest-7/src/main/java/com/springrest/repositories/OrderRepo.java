package com.springrest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springrest.model.Order;


@Repository
public interface OrderRepo extends CrudRepository<Order,Integer>{
	
}
