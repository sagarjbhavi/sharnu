package com.Mail.sender;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Autowired
	private MailSenderModel model;
	
	@RequestMapping("/mail-send")
	public String sendmail() throws MessagingException
	{
		model.mailsend("sagarjbhavi@gmail.com","im looking for a good product","requirement");
		return "sent from sagar";
	}

}
