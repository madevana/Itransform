package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heloworld")
public class HelloController {
	@GetMapping("/get")
	public String display() {
		return "Hello World";
	}

}
