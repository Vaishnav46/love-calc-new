package com.vaishapp.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.vaishapp.lc.api.Phone;

public class PhoneNoSizeValidator implements ConstraintValidator<PhoneNoSize, Phone> {

	@Override
	public boolean isValid(Phone phone, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		if (phone.getCountryCode() == null) {
			return false;
		}
		if (phone.getUserNumber() == null) {
			return false;
		}

		if (phone.getUserNumber().length() < 10) {
			System.out.println("inside size less that 10 condition");
			return false;
		}

		return true;

	}
}
