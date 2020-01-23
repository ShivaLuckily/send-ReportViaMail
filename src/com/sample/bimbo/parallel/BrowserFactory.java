package com.sample.bimbo.parallel;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;



public class BrowserFactory {
	public static WebDriver createInstance(String browser){
		WebDriver driver= null;
		
		 if (browser.equalsIgnoreCase("chrome"))
	        {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shipra Mandal\\Downloads\\chromedriver.exe");
			 ChromeOptions options = new ChromeOptions();
		        options.addArguments("--start-maximized");
		        options.addArguments("--ignore-certificate-errors");
		        options.addArguments("--disable-popup-blocking");
		        driver=new ChromeDriver(options);
		        
	        }
		        else{
		        	
		        	return driver;
		        }
		
		 return driver;
		
	}
		
	    }
	 


