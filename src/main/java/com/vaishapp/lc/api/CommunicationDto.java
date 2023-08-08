package com.vaishapp.lc.api;

import com.vaishapp.lc.validators.PhoneNoSize;

public class CommunicationDto {

	private String email;

	@PhoneNoSize(size = 10 , message = "*enter 10 numbers and not null")
	private Phone phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
