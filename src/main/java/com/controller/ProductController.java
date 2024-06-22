package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;

@Controller
public class ProductController {

	// input product info
	// jsp -> form ->
	@GetMapping("/newproduct")
	public String newProduct() {

		return "NewProduct";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(ProductBean productBean) {
		// logic
		// request.getParameter
		System.out.println("saveProduct()");
		System.out.println(productBean.getProductName());
		System.out.println(productBean.getCategory());
		System.out.println(productBean.getPrice());

		return "Welcome";
	}

}
