package ilkdeneme.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ilkdeneme.domain.mailpage;

@Controller
public class MailController {
	public static String subject;
	public static String text;
	public static String emailAddress;
  
      
    @RequestMapping(value="/mailpage", method=RequestMethod.GET)
    public String mailForm(Model model) {
        
    	model.addAttribute("mailpage", new mailpage());
       
    	return "mailpage";
    }
  
    @RequestMapping(value="/mailpage", method=RequestMethod.POST)
    public String mailSubmit(@ModelAttribute mailpage mailpage, Model model) {
          
        model.addAttribute("subject", mailpage);
        model.addAttribute("text", mailpage);
        model.addAttribute("emailAdress", mailpage);
        subject = (mailpage.getSubject());
        text    = (mailpage.getText());
        emailAddress=(mailpage.getEmailAdress());
        		
        
        return "mail-sent";
    }
  
}
