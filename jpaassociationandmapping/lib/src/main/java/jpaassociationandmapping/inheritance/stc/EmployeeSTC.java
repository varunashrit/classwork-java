package jpaassociationandmapping.inheritance.stc;


	import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

	

	@Entity
	@Table(name="employee_stc")

	//Following annotation must be written only in parent class
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
	//Following is additional column to parent and child
	@DiscriminatorColumn(name="emp_type",discriminatorType = DiscriminatorType.STRING)
	//parent rows will have this value Discriminator column
	@DiscriminatorValue("EMP")
	public class EmployeeSTC {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer empId;
		private String name;
		private Double salary;
	}


