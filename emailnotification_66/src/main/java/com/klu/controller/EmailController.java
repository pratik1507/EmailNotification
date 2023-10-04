package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.EmailManager;

@RestController
@RequestMapping("/mail")
public class EmailController {
	@Autowired
	EmailManager em;
	@GetMapping("/send")
	public String send() {
		String frommail="powarpratik175@gmail.com";
		String tomail="2100032537cseh@gmail.com";
		String subject="wishes message";
		String text="hello pratik, happy birthday ";
		return em.sendMail(frommail, tomail, subject, text);
	}
}
