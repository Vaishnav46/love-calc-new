package com.vaishapp.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vaishapp.lc.api.EmailDto;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emailDto") EmailDto emailDto) {

		return "send-email-page";
	}

	@RequestMapping("/processEmail")
	public String processEmail(@ModelAttribute("emailDto") EmailDto emailDto) {

		return "process-email-page";
	}
}
