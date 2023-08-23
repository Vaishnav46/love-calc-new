package com.vaishapp.lc.service;

import org.springframework.stereotype.Service;

import com.vaishapp.lc.constants.LoveCalculatorConstants;

@Service
public class LcAppServiceImpl implements LcAppService {

	@Override
	public String calculateLove(String userName, String crushName) {

		final String LC_APP_FORMULA = "FLAMES";
		
		System.out.println("names passed to method are " + userName + " " + crushName);

		char ret;
		int userInputLen = (userName + crushName).toCharArray().length;

		int flameLength = LC_APP_FORMULA.toCharArray().length;

		int remainder = userInputLen % flameLength;

		ret = LC_APP_FORMULA.charAt(remainder);

		String result = whatsBetweenUs(ret);
		
		System.out.println("result from method calculateLove is  " + result);
		
		return result;

	}

	@Override
	public String whatsBetweenUs(char calcResult) {

		String finalResult = null;
		if (calcResult == 'F') {
			finalResult = LoveCalculatorConstants.F_CHAR_MEANING;
		} else if (calcResult == 'L') {
			finalResult = LoveCalculatorConstants.L_CHAR_MEANING;
		} else if (calcResult == 'A') {
			finalResult = LoveCalculatorConstants.A_CHAR_MEANING;
		} else if (calcResult == 'M') {
			finalResult = LoveCalculatorConstants.M_CHAR_MEANING;
		} else if (calcResult == 'E') {
			finalResult = LoveCalculatorConstants.E_CHAR_MEANING;
		}else if (calcResult == 'S') {
			finalResult = LoveCalculatorConstants.S_CHAR_MEANING;
		}

		return finalResult;

	}

}
