package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.BookBean;

@Controller
public class BookController {

	// jsp open -> GET
	@GetMapping("/newbook")
	public String newBook() {

		return "NewBook";// jsp name
	}
	
	@PostMapping("/savebook")
	public String saveBook(BookBean bookBean,Model model) {
		
		System.out.println(bookBean.getTitle());
		//send data to jsp 
		model.addAttribute("bookBean",bookBean);

		return "ViewBook";
	}
}
