package common;

import java.io.IOException;

import javax.mail.MessagingException;

public class SendMail extends Mailing{
	
	public static void main(String args[]){
		
		Mailing sm = new Mailing();
		
		try {
			
			sm.mail();
			System.out.println("Report has been sent"); 
		} catch (IOException | MessagingException e) {
			e.printStackTrace();
		}
	}

}
