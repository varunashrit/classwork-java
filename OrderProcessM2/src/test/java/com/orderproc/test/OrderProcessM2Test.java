package com.orderproc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.orderproc.exception.OrderNotFoundException;
import com.orderproc.model.Customer;
import com.orderproc.model.Order;
import com.orderproc.model.Product;
import com.orderproc.repositories.CustomerRepository;
import com.orderproc.repositories.OrderRepository;
import com.orderproc.repositories.ProductRepository;
import com.orderproc.service.OrderService;


@RunWith(MockitoJUnitRunner.class)
public class OrderProcessM2Test {

    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private ProductRepository productRepository;
    @Mock
    private OrderRepository orderRepository;
    @InjectMocks
    private OrderService orderService;

    @Test
    public void placeOrder_ValidInput_OrderPlacedSuccessfully() throws Exception {
        // Arrange
        Customer customer = new Customer(1, "Vidya G", null, null, null);
        Product product = new Product(1, "Product 1", "This is product 1", null);
        when(customerRepository.findById(1)).thenReturn(Optional.of(customer));
        when(productRepository.findById(1)).thenReturn(Optional.of(product));
        doNothing().when(orderRepository).save(any(Order.class));

        // Act
        Order order = orderService.addOrder(1, 1, 2);

        // Assert
        assertNotNull(order);
        assertEquals(1, order.getCustomer().getCustomerid());
        assertEquals(1, order.getProduct().getProductid().longValue());
        assertEquals(2, order.getQuantity());
        verify(customerRepository, times(1)).findById(1);
        verify(productRepository, times(1)).findById(1);
        verify(orderRepository, times(1)).save(any(Order.class));
    }

    @Test(expected = OrderNotFoundException.class)
    public void placeOrder_CustomerNotFound_ThrowsOrderException() throws Exception {
        // Arrange
        when(customerRepository.findById(1)).thenReturn(Optional.empty());

        // Act
        orderService.addOrder(1, 1, 2);

        // Assert
        verify(customerRepository, times(1)).findById(1);
        verify(productRepository, times(0)).findById(1);
        verify(orderRepository, times(0)).save(any(Order.class));
    }

    @Test(expected = OrderNotFoundException.class)
    public void placeOrder_ProductNotFound_ThrowsOrderException() throws Exception {
        // Arrange
        Customer customer = new Customer(1, "Varun Ashrit", null, null, null);
        when(customerRepository.findById(1)).thenReturn(Optional.of(customer));
        when(productRepository.findById(1)).thenReturn(Optional.empty());

        // Act
        orderService.addOrder(1, 1, 2);

        // Assert
        verify(customerRepository, times(1)).findById(1);
        verify(productRepository, times(1)).findById(1);
        verify(orderRepository, times(0)).save(any(Order.class));
    }
}