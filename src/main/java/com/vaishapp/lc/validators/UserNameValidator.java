package com.vaishapp.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vaishapp.lc.api.RegisterationDto;

public class UserNameValidator implements Validator {

	// check if the validator supports the object
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RegisterationDto.class.equals(clazz);
	}

	// write logic here
	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub

		String userName = ((RegisterationDto) object).getUserName();
		userName = userName.trim();
		try {
			if(userName.isEmpty()) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty",
				"*userName cannot be empty or contain white space");
			}
		// logic for string contains underscore

	
			else if (!userName.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString",
					"username should have the char " + "_" + "present in it");

		}
			else {
				
			}
		
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
