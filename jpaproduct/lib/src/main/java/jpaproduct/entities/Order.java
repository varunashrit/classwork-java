package jpaproduct.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="order_info")

public class Order {
	
	@Id
	private Integer orderId;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	@ManyToMany(cascade = CascadeType.ALL) // Owning side
	@JoinTable(name="product_orders_info",joinColumns= {@JoinColumn(name="orderId")}, inverseJoinColumns = {@JoinColumn(name="productId")})
	@Exclude
	private List<Product> products;
	@ManyToOne(cascade = CascadeType.ALL) // Owning side
	@JoinColumn(name="customerId")
	private Customer customer;
	
//	public Order(Integer id, LocalDate orderDate, LocalDate deliveryDate, String status, List<Product> products,
//			Customer customer) {
//		super();
//		this.id = id;
//		this.orderDate = orderDate;
//		this.deliveryDate = deliveryDate;
//		this.status = status;
//		this.products = products;
//		this.customer = customer;
//	}

	
}
