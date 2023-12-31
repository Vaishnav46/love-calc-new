package com.vaishapp.lc.api;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import com.vaishapp.lc.validators.Age;

public class RegisterationDto {

	@NotEmpty(message = "*Name cannot be empty")
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;

	@Age
	private Integer age;

	private CommunicationDto communicationDto;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDto getCommunicationDto() {
		return communicationDto;
	}

	public void setCommunicationDto(CommunicationDto communicationDto) {
		this.communicationDto = communicationDto;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "RegisterationDto [name=" + name + ", userName=" + userName + ", password=" + Arrays.toString(password)
				+ ", country=" + country + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender + ", age="
				+ age + ", communicationDto=" + communicationDto + "]";
	}

}
