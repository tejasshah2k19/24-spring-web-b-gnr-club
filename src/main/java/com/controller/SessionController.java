package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

	//logic -> 
	//jsp open 
	//submit -> logic 
	@GetMapping("/signup")
	public String signup() {
		
		return "Signup";//jsp name -> open jsp 
	}

	
	@GetMapping("/login")
	public String login() {
		return "Login";//jsp name 
	}
	
	
	
}
	
//url -> to open the jsp 