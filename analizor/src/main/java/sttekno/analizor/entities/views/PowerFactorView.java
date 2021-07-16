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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "power_factors_view")
public class PowerFactorView {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "pf1")
	private double pf1;
	
	@Column(name = "pf2")
	private double pf2;
	
	@Column(name = "pf3")
	private double pf3;
	
	@Column(name = "pf_average")
	private double pfAverage;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
