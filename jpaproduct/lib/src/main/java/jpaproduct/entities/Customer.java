package jpaproduct.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="customer_info")
public class Customer {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private String name;
	private Integer tier;
	@OneToMany(mappedBy = "customer") // Inverse side
	@Exclude
	private List<Order> orders;
	
	public Customer(Long customerId, String name, Integer tier) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.tier = tier;
	}


}
