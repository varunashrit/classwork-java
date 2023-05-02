package webapp.entities;

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
@NoArgsConstructor

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString

	
	
	@Table(name="dealer_details")
	public class Dealer {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer dealerId;
		private String dealerName;
		private String city;
		


}
