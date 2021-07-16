package sttekno.analizor.entities.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserForLoginDto {
	@Email
	@NotBlank
	@NotEmpty
	@NotNull
	private String email;
	
	@NotBlank
	@NotEmpty
	@NotNull
	private String Password;
}
