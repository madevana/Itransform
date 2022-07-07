package com.springrest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.model.Location;
@Service
public class LocationService {

	

public List<Location> locationlist= new ArrayList<>();
{
locationlist.add(new Location("522265","Ap","Guntur","India"));
locationlist.add(new Location("99509","AK","ANCHORAGE","US"));
locationlist.add(new Location("66101","K","KANSAS CITY","US"));
}

		
		public List<Location> getAll(){
			return locationlist;
		}	
		
		public Location getLoc(String zipcode){
			return locationlist.stream().filter(s->s.getZipcode().equals(zipcode)).findFirst().get();
		}
		

}
