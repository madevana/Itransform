package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capg.model.Location;



@Repository
public interface LocationRepository extends MongoRepository<Location, Integer> {

}
