package com.vaishapp.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {
		// useed to write post construct work here
		this.upper = age.upper();
		this.lower = age.lower();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// write logic here
		if (age == null) {
			return false;
		}

		if (age < lower || age > upper) {
			return false;
		}

		return true;
	}

}
