package common;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseClass {
	
	
	public WebDriver driver;
		
	
	
	@BeforeSuite
	public void start(){
		
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("Start before suite");	
	}
	
	@AfterSuite	
	
	
     public void email() throws InterruptedException{
		driver.close();
		Thread t = new Thread()
		{
		    public void run() {
		    	Mailing sm = new Mailing();
				
				try {
					
					sm.mail();
					System.out.println("Report has been sent"); 
				} catch (IOException | MessagingException e) {
					e.printStackTrace();
				}
		    }
		};
		Thread.sleep(10000);
		t.start();
		t.join();
		
		
		
			/*		Mailing sm = new Mailing();
			try {
				Thread.sleep(20000);
				sm.mail();
				System.out.println("Report has been sent"); 
			} catch (IOException | MessagingException e) {
				e.printStackTrace();
			}
			
		  */
		
		
		

	}
}
