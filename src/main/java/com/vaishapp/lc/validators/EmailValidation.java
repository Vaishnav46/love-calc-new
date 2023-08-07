package com.vaishapp.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vaishapp.lc.api.RegisterationDto;

public class EmailValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RegisterationDto.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDto.email", "email.invalid",
				"email cannot be empty");

		String email = ((RegisterationDto) object).getCommunicationDto().getEmail();
		if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("communicationDto.email", "email.invalid", "email should end with @gmail.com");
		}
	}

}
