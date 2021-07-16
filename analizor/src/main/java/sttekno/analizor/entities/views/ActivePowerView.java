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
@Table(name = "active_powers_view")
public class ActivePowerView {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "p1")
	private double p1;
	
	@Column(name = "p2")
	private double p2;
	
	@Column(name = "p3")
	private double p3;
	
	@Column(name = "psum")
	private double psum;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
