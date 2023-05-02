package jpaproduct.dao;

import java.util.List;

import jpaproduct.entities.Order;

public interface OrderDAO {
	public Order createOrder(Order order);
	public List<Order> getOrders();

}
