package jpaassociationandmapping.inheritance.tpc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employee_tpc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//Following annotation must be written only in parent class
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class EmployeeTPC {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	private String name;
	private Double salary;
}

