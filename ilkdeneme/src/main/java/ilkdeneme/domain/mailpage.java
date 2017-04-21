package ilkdeneme.domain;

public class mailpage {
	
	private String emailAddress;
	private String text;
	private String subject;
	
	public mailpage(){
		
	}
	
	public String getEmailAdress(){
    	return emailAddress;
    	}
	
	public void setEmailAdress(String emailAdress){
		
		this.emailAddress = emailAdress;
		}
	
	public String getText(){
    	return text;
        }
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getSubject(){
    	return subject;
     }
	
	public void setSubject(String subject){
	    this.subject = subject;
	}


}
