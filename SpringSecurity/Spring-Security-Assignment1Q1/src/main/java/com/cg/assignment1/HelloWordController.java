package com.cg.assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController 
{
	 @GetMapping("/")
public String HelloWold()
{
	return "Hello Wold";
}
}
