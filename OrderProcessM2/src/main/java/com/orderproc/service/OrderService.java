package com.orderproc.service;

import java.util.List;

import com.orderproc.exception.OrderNotFoundException;
import com.orderproc.model.Order;

public interface OrderService {
	public Order addOrder(Order order) ;
	public Order updateOrder(Order order) throws OrderNotFoundException;
	public Order deleteOrder(int orderid) throws OrderNotFoundException;
	public Order viewOrder(int orderid) throws OrderNotFoundException;
	public List<Order> viewAllOrders();

}
