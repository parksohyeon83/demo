package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/")
public class HelloController {
	
	@GetMapping
	public String hello() {
        return "hello";
    }
	
	
}
