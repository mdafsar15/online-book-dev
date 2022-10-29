package com.bridgelabz.bookstore.dto;

import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class RegistrationDto {

//	@Pattern(regexp = "^[A-Z][a-z]+\\s?[A-Z][a-z]+$", message = "Please Enter Valid FirstName")
	private String firstName;

	private String lastName;

	private String kyc;

	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,20}$", message = "Password length should be 8 must contain at least one uppercase, lowercase, special character and number")
	private String password;

	@Pattern(regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "EmailId Should follow this pattern abc.xyz@gmail.com.in")
	private String emailId;

	private long otp;

}
