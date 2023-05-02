package com.orderproc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.orderproc.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
