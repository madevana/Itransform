package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Location;
import com.springrest.service.LocationService;

@RestController
@RequestMapping("/")
public class LocationController {
	@Autowired
	LocationService lService;
	@GetMapping("/all")
	public List<Location> getAll() {
		return lService.getAll();
	}
	@GetMapping("/all/{zipcode}")
	public Location getone(@PathVariable String zipcode) {
		return lService.getLoc(zipcode);
	}
	

}
