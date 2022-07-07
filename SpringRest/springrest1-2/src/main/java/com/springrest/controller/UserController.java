package com.springrest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.User;

@RestController

public class UserController {
	
	@RequestMapping("/api/login")
	public String userLogin(@PathVariable String userName,@PathVariable String password) {
		if(userName.equals("Mani")&&password.equals("Nari"))
			return "Successfully Login";
		else
			return "Login Failed";
		
	}

}
