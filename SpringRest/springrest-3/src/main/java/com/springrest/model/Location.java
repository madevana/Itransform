package com.springrest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="location")
public class Location {
	@Id
	String zipcode;
	String state;
	String city;
	String county;
	public Location(String zipcode, String state, String city, String county) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.county = county;
	}
	
	public Location() {
		super();
	}

	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
}
