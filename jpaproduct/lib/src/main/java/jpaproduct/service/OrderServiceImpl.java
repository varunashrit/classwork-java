package jpaproduct.service;

import java.util.List;

import jpaproduct.dao.OrderDAO;
import jpaproduct.dao.OrderDAOImpl;
import jpaproduct.entities.Order;

public class OrderServiceImpl implements OrderService {
	
	private OrderDAO orderDao = new OrderDAOImpl();
	
	@Override
	public Order createOrder(Order order) {
		
		return orderDao.createOrder(order);
	}

	@Override
	public List<Order> getOrders() {
		
		return orderDao.getOrders();
	}

}
