package com.vaishapp.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.vaishapp.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("Inside print method of phone number formatter");

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		// TODO Auto-generated method stub

		System.out.println("Inside parse method of phone number formatter");

		// whether numbre consist of -
		Phone phone = new Phone();
		String[] phonheNumberArray = completePhoneNumber.split("-");
		int index = completePhoneNumber.indexOf("-");
		// logic
		if (index == -1) {
			phone.setCountryCode("91");
			phone.setUserNumber(phonheNumberArray[0]);
		} else if (index == 0) {
			phone.setCountryCode("91");
			phone.setUserNumber(phonheNumberArray[1]);

		} else {

			phone.setCountryCode(phonheNumberArray[0]);
			phone.setUserNumber(phonheNumberArray[1]);
		}
		return phone;
	}

}
