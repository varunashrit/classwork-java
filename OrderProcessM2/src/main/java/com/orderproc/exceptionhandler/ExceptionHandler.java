package com.orderproc.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.orderproc.exception.CustomerNotFoundException;
import com.orderproc.exception.OrderNotFoundException;
import com.orderproc.exception.ProductNotFoundException;
//
//@RestControllerAdvice
//public class ExceptionHandler {
//	@org.springframework.web.bind.annotation.ExceptionHandler(CustomerNotFoundException.class)
//	public String handleCustomerNotFoundException() {
//		return "Customer not found";
//		}
//	
//	@org.springframework.web.bind.annotation.ExceptionHandler(OrderNotFoundException.class)
//	public String handleOrderNotFoundException() {
//		return "Order not found";
//		}
//	@org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
//	public String handleProductNotFoundException() {
//		return "Product not found";
//		}
//}
@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
	private String desc="Description";
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
 HttpHeaders headers, HttpStatus status, WebRequest request){
 Map<String, String> map = new HashMap<>();
 ex.getBindingResult().getAllErrors().forEach((error)->{
 String fieldName = ((FieldError)error).getField();
 String msg = error.getDefaultMessage();
 map.put(fieldName, msg);
 });
 return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerException(CustomerNotFoundException ex) {
 HttpHeaders header = new HttpHeaders();
 header.add(desc, "Trying to get a customer");
 return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleOrderException(OrderNotFoundException ex) {
 HttpHeaders header = new HttpHeaders();
 header.add(desc, "Trying to get a order");
 return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductException(ProductNotFoundException ex) {
 HttpHeaders header = new HttpHeaders();
 header.add(desc, "Trying to get a product");
 return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	
}
