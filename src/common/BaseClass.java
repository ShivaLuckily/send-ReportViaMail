package common;

import java.io.IOException;

import javax.mail.MessagingException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.sample.bimbo.parallel.BrowserFactory;
import com.sample.bimbo.parallel.DriverFactory;



public class BaseClass {
	
	
public WebDriver driver;
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public void start(String browser){
		
		driver = BrowserFactory.createInstance(browser);
		DriverFactory.getInstance().setDriver(driver);
		driver=DriverFactory.getInstance().getDriver();
		
		
		/*System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("Start before suite");*/	
		System.out.println("Thread id"+Thread.currentThread().getId());	
	}
	
	@AfterMethod
	
	
     public void email() throws InterruptedException{
		
		DriverFactory.getInstance().removeDriver();
		//driver.close();
		//System.out.println("Start after suite");
		/*Thread t = new Thread()
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
		t.join();*/
		
		
		
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
