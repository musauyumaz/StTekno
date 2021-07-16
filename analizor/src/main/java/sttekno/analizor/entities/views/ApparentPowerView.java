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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "apparent_powers_view")
public class ApparentPowerView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "s1")
	private double s1;
	
	@Column(name = "s2")
	private double s2;
	
	@Column(name = "s3")
	private double s3;
	
	@Column(name = "ssum")
	private double ssum;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
