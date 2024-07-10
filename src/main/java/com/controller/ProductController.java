package com.controller;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		try {
			System.out.println(productBean.getProductImage().getOriginalFilename());
			System.out.println(productBean.getProductImage().getBytes().length);

			String productImagePath = "C:\\sts\\24-spring-club-gnr\\src\\main\\webapp\\images\\products";

			File file = new File(productImagePath, productBean.getProductImage().getOriginalFilename());
			byte b[] = productBean.getProductImage().getBytes();
			FileUtils.writeByteArrayToFile(file, b);

			productBean.setProductImagePath(
					"images/products/" + productBean.getProductImage().getOriginalFilename());

		} catch (Exception e) {
			e.printStackTrace();
		}

		// insert query ->
		// update()-> insert update delete
		stmt.update("insert into products (productName,category,price,productImagePath) values (?,?,?,?)",
				productBean.getProductName(), productBean.getCategory(), productBean.getPrice(),
				productBean.getProductImagePath());
		return "Welcome";
	}

	@GetMapping("/listproducts")
	public String listProducts(Model model) {

		List<ProductBean> products = stmt.query("select * from products",
				new BeanPropertyRowMapper<>(ProductBean.class));
		model.addAttribute("products",products);
		return "ListProducts";
	}

}
