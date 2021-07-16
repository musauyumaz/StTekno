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
@Table(name = "currents_view")
public class CurrentView {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "i1")
	private double i1;
	
	@Column(name = "i2")
	private double i2;
	
	@Column(name = "i3")
	private double i3;
	
	@Column(name = "i_avg")
	private double iAvg;
	
	@Column(name = "i_n")
	private double iN;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
