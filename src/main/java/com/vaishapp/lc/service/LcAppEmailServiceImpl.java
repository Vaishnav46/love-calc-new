package com.vaishapp.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LcAppEmailServiceImpl implements LcAppEmailService {

	@Autowired
	private JavaMailSender javaMailSenderImpl;
	
	@Override
	public void sendEmail(String userName, String userEmail, String result) {
		// TODO Auto-generated method stub
		
		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		newEmail.setSubject("Love Calculator App result");
		newEmail.setText("Hi "+ userName + " The Result predicted by the LC app is " + result);
		
		javaMailSenderImpl.send(newEmail);
		
	}

	

	

}
