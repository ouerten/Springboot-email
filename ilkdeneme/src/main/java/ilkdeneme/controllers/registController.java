package ilkdeneme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ilkdeneme.controllers.MailController;
import ilkdeneme.domain.mailpage;
import ilkdeneme.service.NotificationService;
@RestController
public class registController {
	@Autowired
	private NotificationService notificationService;
    
	
	
	@RequestMapping("/mail-sent")
	public String signupSuccess(){
	mailpage mailpage = new mailpage();
	
    mailpage.setEmailAdress("ouerten@yahoo.com");
    mailpage.setText(MailController.text);
    mailpage.setEmailAdress(MailController.emailAddress);
    mailpage.setSubject(MailController.subject);

    
   try{
     
	   notificationService.sendNotification(mailpage);
    	
      }catch(MailException e){
     
        }
    
    return "Your mail has successfully sent";

	}
}
