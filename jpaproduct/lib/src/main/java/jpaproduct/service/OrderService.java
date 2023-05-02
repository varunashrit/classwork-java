package jpaproduct.service;

import java.util.List;

import jpaproduct.entities.Order;

public interface OrderService {
	public Order createOrder(Order order);
	public List<Order> getOrders();
}
