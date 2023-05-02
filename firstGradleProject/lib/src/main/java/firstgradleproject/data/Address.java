package firstgradleproject.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
//	create table address(addressId serial primary key, houseno int,
//	street varchar(25), city varchar(25),state varchar(25),
//	country varchar(50));
	
	private Integer addressId;
	private Integer houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
}
