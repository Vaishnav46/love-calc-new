package com.vaishapp.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDto {

	@NotBlank(message = "*username cannot be empty")
	//@Min(value = 3 , message = "*username should atleast have 3 characters")
	@Size(min = 3 , max = 15 , message = "*user name should have minimum characters between 3 - 15")
	private String userName;
	
	@NotBlank(message = "*username cannot be empty")
	//@Min(value = 3 , message = "*username should atleast have 3 characters")
	@Size(min = 3 , max = 15 , message = "*user name should have minimum characters between 3 - 15")
	private String crushName;
	
	@AssertTrue(message = "You have to agree to proceed with the app")
	private boolean termsAndConditions;

	public UserInfoDto() {
		System.out.println("UserInfo constructor has been called succesfully");
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDto [userName=" + userName + ", crushName=" + crushName + "]";
	}
	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}
	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

}
