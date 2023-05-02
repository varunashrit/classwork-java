package com.orderproc.controller;

import java.util.List;
import java.util.logging.Level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderproc.exception.ProductNotFoundException;
import com.orderproc.model.Product;
import com.orderproc.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController{
	
//	Logger logger = Logger.getLogger(ProductController.class.getName());
//	private static final Logger logger = LogManager.getLogger(ProductController.class.getName());
//	
//	public ProductController() {
// logger.log(null, null, Level.INFO,"-----> Product Rest Controller Working!");
//	}
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody @Valid Product product) {
 this.productservice.addProduct(product);
 return product;
	}
	@GetMapping("/view/{productid}")
	public Product viewProduct(@PathVariable("productid") int productid) throws ProductNotFoundException {
 return this.productservice.viewProduct(productid);
	}
	
	@PutMapping("/updateproduct")
	public Product updateProduct(@RequestBody @Valid Product product) throws ProductNotFoundException{
 return this.productservice.updateProduct(product);
	}
	
	@GetMapping("/viewAllproducts")
	public List<Product> viewAllProducts() {
 return productservice.viewAllProducts();
	}
	
	
	
	@DeleteMapping("/delete/{productid}")
	public String deleteProduct(@PathVariable("productid") int productid) throws ProductNotFoundException{
 productservice.deleteProduct(productid);
	return "Deleted Customer is:"+productid;
	}
}