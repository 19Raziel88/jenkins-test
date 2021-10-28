package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SalutiRestController {

	@GetMapping(value = "/test")
	public String getGreetings() {
		
		return "Saluti, sono il tuo primo Docker container!";
	}
	
	@GetMapping(value = "/test2")
	public String getGreet() {
		
		return "Saluti, dal corso JEE";
	}
}