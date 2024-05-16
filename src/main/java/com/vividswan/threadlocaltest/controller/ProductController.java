package com.vividswan.threadlocaltest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vividswan.threadlocaltest.repository.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		// productService.addProduct(product);
	}

	@GetMapping
	public List<Product> getAllProducts() {
		// return productService.getAllProducts();
	}
}
