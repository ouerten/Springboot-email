package ilkdeneme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import ilkdeneme.domain.mailpage;

@Service
public class NotificationService {
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotification(mailpage mailpage) throws MailException{
		//send mail
		 SimpleMailMessage mail = new SimpleMailMessage();
	
		 mail.setFrom("ouert2017@gmail.com");	
		 mail.setTo(mailpage.getEmailAdress());
		 mail.setSubject(mailpage.getSubject());
		 mail.setText(mailpage.getText());
		 	
		javaMailSender.send(mail);
	}
}
	