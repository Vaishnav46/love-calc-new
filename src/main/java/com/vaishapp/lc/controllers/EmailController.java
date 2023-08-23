package com.vaishapp.lc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.vaishapp.lc.api.EmailDto;
import com.vaishapp.lc.api.UserInfoDto;
import com.vaishapp.lc.service.LcAppEmailServiceImpl;

@Controller
public class EmailController {

	@Autowired
	private LcAppEmailServiceImpl lcAppEmailServiceImpl;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {

		model.addAttribute("emailDto", new EmailDto());

		return "send-email-page";
	}

	@RequestMapping("/processEmail")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDto userInfoDto,
			@ModelAttribute("emailDto") EmailDto emailDto,HttpSession httpSession) {

		lcAppEmailServiceImpl.sendEmail(userInfoDto.getUserName(), emailDto.getUserEmail(), httpSession.getAttribute("result").toString());
		
		return "process-email-page";
	}
}
