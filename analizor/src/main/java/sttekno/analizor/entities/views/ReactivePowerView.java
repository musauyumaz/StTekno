package sttekno.analizor.entities.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reactive_powers_view")
public class ReactivePowerView {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "q1")
	private double q1;
	
	@Column(name = "q2")
	private double q2;
	
	@Column(name = "q3")
	private double q3;
	
	@Column(name = "qsum")
	private double qsum;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
