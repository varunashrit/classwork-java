package com.orderproc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderproc.exception.OrderNotFoundException;
import com.orderproc.model.Order;
import com.orderproc.service.OrderService;

import jakarta.validation.Valid;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderservice;

	@PostMapping("/addorder")
	public Order addCustomer(@RequestBody @Valid Order order) {
		this.orderservice.addOrder(order);
		return order;
	}

	@GetMapping("/view/{orderid}")
	public Order viewOrder(@PathVariable("orderid") int orderid) throws OrderNotFoundException {
		return this.orderservice.viewOrder(orderid);
	}

	@PutMapping("/updateorder")
	public Order updateOrder(@RequestBody @Valid Order order) throws OrderNotFoundException {
		return this.orderservice.updateOrder(order);
	}

	@GetMapping("/viewAllorders")
	public List<Order> viewAllOrder() {
		return orderservice.viewAllOrders();
	}

	@DeleteMapping("/delete/{orderid}")
	public String deleteorder(@PathVariable("orderid") int orderid) throws OrderNotFoundException {
		orderservice.deleteOrder(orderid);
		return "Deleted Customer is:" + orderid;
	}
}