package com.orderproc.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orderproc.exception.OrderNotFoundException;
import com.orderproc.model.Order;
import com.orderproc.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	Logger logger = Logger.getLogger(OrderServiceImpl.class.getName());
	@Autowired
	OrderRepository repository;

	public OrderServiceImpl(OrderRepository repository) {
		super();
		this.repository = repository;
	}

	@Transactional

	public Order addOrder(Order order) {
		try {
			repository.save(order);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return order;
	}

	public Order updateOrder(Order order) throws OrderNotFoundException {
		Optional<Order> optional = repository.findById(order.getOrderId());
		if (optional.isPresent()) {
			repository.save(order);
			return optional.get();
		} else {
			throw new OrderNotFoundException("Order couldn't be Updated! ");
		}
	}

	@Override
	public Order deleteOrder(int orderid) throws OrderNotFoundException {
		Optional<Order> optional = repository.findById(orderid);
		if (optional.isPresent()) {
			repository.deleteById(orderid);
			return optional.get();
		} else {
			throw new OrderNotFoundException("Order not found for delete operation!");
		}
	}

	@Override
	public Order viewOrder(int orderid) throws OrderNotFoundException {
		Optional<Order> optional = repository.findById(orderid);
		try {
			if (optional.isPresent()) {
				repository.findById(orderid);
			} else {
				throw new OrderNotFoundException("Order not found with the matching ID!");
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new OrderNotFoundException("Order not found with the matching ID!");
		}
		return optional.get();
	}

	@Override
	public List<Order> viewAllOrders() {
		List<Order> orderList = null;
		try {
			orderList = (List<Order>) repository.findAll();
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return orderList;
	}

}
