package com.vaishapp.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vaishapp.lc.api.RegisterationDto;
import com.vaishapp.lc.api.UserInfoDto;

@Controller
public class LcAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDto userInfoDto) {
		return "home";
	}
	
	@RequestMapping("/processHomePage")
	public String processHomePage(UserInfoDto userInfoDto,Model model) {
		
//		System.out.println(userName);
//		System.out.println(crushName);
//		model.addAttribute("userName", userInfoDto.getUserName());
//		model.addAttribute("crushName", userInfoDto.getCrushName());
		
		System.out.println("from dto " +userInfoDto.getCrushName() + userInfoDto.getUserName());
		model.addAttribute("userInfo",userInfoDto);
		return "result";
	}
	
	@RequestMapping("/registration-page")
	public String registrationPage(@ModelAttribute("regDto") RegisterationDto regDto) {
		return "registeration-page";
	}
	
	@RequestMapping("regSuccess")
	public String regSuccessPage(@ModelAttribute("regDto") RegisterationDto regDto) {
		return "reg-success-page";
	}
}
