package com.Mail.sender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailSenderModel {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void mailsend(String to,String subject, String body) throws MessagingException
	{
		MimeMessage msg=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(msg,true);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body);
		
		javaMailSender.send(msg);
		
		
		
	}
	
	

}
