package com.vaishapp.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
	public String processHomePage(@Valid @ModelAttribute("userInfo") UserInfoDto userInfoDto,BindingResult result) {
		
//		System.out.println(userName);
//		System.out.println(crushName);
//		model.addAttribute("userName", userInfoDto.getUserName());
//		model.addAttribute("crushName", userInfoDto.getCrushName());
		
		if(result.hasErrors()) {
			System.out.println("result has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home";
		}
		return "result";
	}
	
	
}
