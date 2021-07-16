package sttekno.analizor.entities.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerForRegisterDto {
	@Email
	@NotEmpty
	@NotNull
	@NotBlank
	private String email;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String password;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String passwordAgain;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String firstName;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String lastName;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String companyName;
	
	@NotEmpty
	@NotNull
	@NotBlank
	private String phoneNumber;
	
}
