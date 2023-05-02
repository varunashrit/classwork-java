package jpaassociationandmapping.manytomany;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* 
* Order is the owning entity, owning entity should have @JoinTable
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="order_master")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private LocalDate orderDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	/**
	 * Columns orderId and productId implicitly be composite primary key of the JOin table product_orders
	 */
	@JoinTable(name="product_orders",joinColumns= {@JoinColumn(name="orderId")},
										inverseJoinColumns = {@JoinColumn(name="productId")})
	private Set<Product> products;



}

