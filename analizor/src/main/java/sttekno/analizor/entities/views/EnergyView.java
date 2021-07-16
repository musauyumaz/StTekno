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
@Table(name = "energies_view")
public class EnergyView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "ae_imp")
	private double aeImp;
	
	@Column(name = "ae_exp")
	private double aeExp;
	
	@Column(name = "ae_total")
	private double aeTotal;
	
	@Column(name = "ae_net")
	private double aeNet;
	
	@Column(name = "re_imp")
	private double reImp;
	
	@Column(name = "re_exp")
	private double reExp;
	
	@Column(name = "re_total")
	private double reTotal;
	
	@Column(name = "re_net")
	private double reNet;
	
	@Column(name = "se_total")
	private double seTotal;
	
	@Column(name = "analizor_name")
	private String analizorName;
}
