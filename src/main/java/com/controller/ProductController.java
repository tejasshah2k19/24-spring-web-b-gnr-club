package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	
	//input product info 
	//jsp -> form -> 
	@GetMapping("/newproduct")
	public String newProduct() {
		
		return "NewProduct";
	}
	
	@PostMapping("/saveproduct")
	public String saveProduct() {
		//logic 
		System.out.println("saveProduct()");
		
		
		return "Welcome";
	}
	
}
