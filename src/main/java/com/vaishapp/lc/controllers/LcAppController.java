package com.vaishapp.lc.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vaishapp.lc.api.UserInfoDto;
import com.vaishapp.lc.service.LcAppService;

@Controller
@SessionAttributes("userInfo") // ---> whenever you have nmodelAttribute in code this will not work...so remove
								// it and use model
public class LcAppController {

	@Autowired
	private LcAppService lcAppService;

	@RequestMapping("/")
	public String showHomePage(Model model) {
		model.addAttribute("userInfo", new UserInfoDto());

		return "home";
	}

	@RequestMapping("/processHomePage")
	public String processHomePage(@Valid @ModelAttribute("userInfo") UserInfoDto userInfoDto, BindingResult result,
			Model model, HttpSession session) {

//		System.out.println(userName);
//		System.out.println(crushName);
//		model.addAttribute("userName", userInfoDto.getUserName());
//		model.addAttribute("crushName", userInfoDto.getCrushName());

		if (result.hasErrors()) {
			System.out.println("result has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home";
		}

		// create a session for userName bcoz cookies has lot of limitations
		String appResult = lcAppService.calculateLove(userInfoDto.getUserName(), userInfoDto.getCrushName());

		System.out.println("final result is " + appResult);

		model.addAttribute("finalResult", appResult);
		
		session.setAttribute("result", appResult);

		return "result";
	}

}
