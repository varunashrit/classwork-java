package jpaassociationandmapping.onetoone;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

	@Entity
	@Table(name="address_onetoone")
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	public class Address {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String street;	
		private String city;
		private String country;
		private Integer pinCode;
}
