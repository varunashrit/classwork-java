package jpaassociationandmapping.bi;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import jpaassociationandmapping.onetoone.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="student_onetobi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class StudentBi {

		@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private LocalDate dateOfBirth;
	private String city;
	private String country;
	private String street;
	private Integer pincode;
	//HAS-A
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Address addressBi;
	}


