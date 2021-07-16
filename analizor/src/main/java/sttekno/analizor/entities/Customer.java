package sttekno.analizor.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sttekno.analizor.core.entities.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id" ,referencedColumnName = "id")
@Table(name = "customers")
public class Customer extends User{
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String firstName;
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String lastName;
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String companyName;
	

	
}
