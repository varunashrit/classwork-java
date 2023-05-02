package webapp.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)// auto generate
	private Long id;

	@Column(name = "first_name", nullable=false)
	@NotNull //->  should not have value null
	// server validation / bean, apply for string
	// Database not null on database schema
	@NotEmpty(message = "*Please provide first name")// JPA Validation -> empty string text "" , not validate in database
	@NotBlank // not accepted " " "" null
	private String firstName;
	
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide last name")
	private String lastName;
	
	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;

}


