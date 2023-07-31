package com.vaishapp.lc.api;

public class UserInfoDto {

	private String userName = "John";
	private String crushName = "Doe";

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

}
