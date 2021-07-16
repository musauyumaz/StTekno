package sttekno.analizor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phase_voltages")
@EqualsAndHashCode(callSuper = false)
public class PhaseVoltage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "u1")
	private double u1;
	
	@Column(name = "u2")
	private double u2;
	
	@Column(name = "u3")
	private double u3;
	
	@Column(name = "uln_avg")
	private double ulnAvg;
	
	@ManyToOne()
	@JoinColumn(name = "analizor_id")
	private Analizor analizor;
	
}
