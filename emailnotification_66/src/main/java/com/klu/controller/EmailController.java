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
		String frommail="<-- sender mail --->";
		String tomail="<-- receiver mail -->";
		String subject="<-- subject -->";
		String text="<-- message -->";
		return em.sendMail(frommail, tomail, subject, text);
	}
}
