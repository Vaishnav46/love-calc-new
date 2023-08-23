package com.vaishapp.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vaishapp.lc.api.CommunicationDto;
import com.vaishapp.lc.api.Phone;
import com.vaishapp.lc.api.RegisterationDto;
import com.vaishapp.lc.customeditor.NamePropertyEditor;
import com.vaishapp.lc.validators.EmailValidation;
import com.vaishapp.lc.validators.UserNameValidator;

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
	public String regSuccessPage(@Valid @ModelAttribute("regDto") RegisterationDto regDto, BindingResult result) {

		System.out.println("name value enter is " + "|" + regDto.getName() + "|");

		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();

			for (Object error : allErrors) {
				System.out.println("error occured : " + error);
			}

			return "registeration-page";
		}
		System.out.println("Inside RegSuccess page");
		return "reg-success-page";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		// binder.setDisallowedFields("userName");
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", trimmer);

		NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", namePropertyEditor);

		// custom editor
		binder.registerCustomEditor(String.class, "userName", namePropertyEditor);

		// validator
		binder.addValidators(new UserNameValidator());

		binder.addValidators(new EmailValidation());
	}

}
