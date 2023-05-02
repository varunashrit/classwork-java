package com.orderproc.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderproc.exception.ProductNotFoundException;
import com.orderproc.model.Product;
import com.orderproc.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger logger = LogManager.getLogger(ProductServiceImpl.class);
//	Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());
	@Autowired
	ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	@Transactional
	@Override
	public Product addProduct(Product product) {
		try {
			repository.save(product);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return product;
	}

	@Override
	public Product updateProduct(Product product) throws ProductNotFoundException {
		Optional<Product> optional = repository.findById(product.getProductid());
		if (optional.isPresent()) {
			repository.save(product);
			return optional.get();
		} else {
			throw new ProductNotFoundException("Product couldn't be Updated! ");
		}
	}

	@Override
	public Product deleteProduct(int productid) throws ProductNotFoundException {
		Optional<Product> optional = repository.findById(productid);
		if (optional.isPresent()) {
			repository.deleteById(productid);
			return optional.get();
		} else {
			throw new ProductNotFoundException("Order not found for delete operation!");
		}
	}

	@Override
	public Product viewProduct(int productid) throws ProductNotFoundException {
		Optional<Product> optional = repository.findById(productid);
		try {
			if (optional.isPresent()) {
				repository.findById(productid);
			} else {
				throw new ProductNotFoundException("Product not found with the matching ID!");
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new ProductNotFoundException("Product not found with the matching ID!");
		}
		return optional.get();
	}

	@Override
	public List<Product> viewAllProducts() {
		List<Product> productList = null;
		try {
			productList = (List<Product>) repository.findAll();
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return productList;
	}
}
