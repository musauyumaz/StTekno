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
@Table(name = "total_demands_view")
public class TotalDemandView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "p_dm")
	private double pDm;
	
	@Column(name = "q_dm")
	private double qDm;
	
	@Column(name = "s_dm")
	private double sDm;
	
	@Column(name = "i1_dm")
	private double i1Dm;
	
	@Column(name = "i2_dm")
	private double i2Dm;
	
	@Column(name = "i3_dm")
	private double i3Dm;
	
	@Column(name = "iavg_dm")
	private double iavgDm;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
