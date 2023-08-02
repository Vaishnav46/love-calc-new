package com.vaishapp.lc.api;

import org.springframework.stereotype.Component;

public class CommunicationDto {

	private String email;
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