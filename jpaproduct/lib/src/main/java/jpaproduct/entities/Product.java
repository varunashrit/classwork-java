package jpaproduct.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name="product_info")

public class Product {
	@Id
	private Long productId;
	private String name;
	private String category;
	private Double price;
	@ManyToMany(mappedBy = "products")
	@Exclude
	private List<Order> orders;
	
	public Product(Long productId, String name, String category, Double price){
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
	}

}
