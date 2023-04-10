package com.example.demo.ashwinee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class DemoController {
@GetMapping("/welcome/{name}")
public String meth1(@PathVariable String name)
{
	return "<h1>Hai "+name+" Welcome to Spring Boot</h1>";
}
	@GetMapping("/user")
	public String meth2()
	{
		return "<h1>Welcome to Spring Boot</h1>";
	}
}
