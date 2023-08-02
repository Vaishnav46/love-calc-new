package com.vaishapp.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vaishapp.lc.api.CommunicationDto;
import com.vaishapp.lc.api.Phone;
import com.vaishapp.lc.api.RegisterationDto;

@Controller
public class RegisterationController {
	
	@RequestMapping("/registration-page")
	public String registrationPage(@ModelAttribute("regDto") RegisterationDto regDto) {
		
		System.out.println("Inside showReg page");
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("2233445566");
		
		CommunicationDto communicationDto = new CommunicationDto();
		communicationDto.setPhone(phone);
		regDto.setCommunicationDto(communicationDto);
		
		return "registeration-page";
	}

	@RequestMapping("regSuccess")
	public String regSuccessPage(@ModelAttribute("regDto") RegisterationDto regDto) {
		
		System.out.println("Inside RegSuccess page");
		return "reg-success-page";
	}

}
