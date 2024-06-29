package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;

@Controller
public class ProductController {

	@Autowired
	JdbcTemplate stmt;

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

		// insert query ->
		// update()-> insert update delete
		stmt.update("insert into products (productName,category,price) values (?,?,?)", productBean.getProductName(),
				productBean.getCategory(), productBean.getPrice());
		return "Welcome";
	}

}
