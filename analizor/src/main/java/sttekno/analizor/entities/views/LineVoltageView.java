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
@Table(name = "line_voltages_view")
public class LineVoltageView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "u12")
	private double u12;
	
	@Column(name = "u23")
	private double u23;
	
	@Column(name = "u13")
	private double u13;
	
	@Column(name = "ull_avg")
	private double ullAvg;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
