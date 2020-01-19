package com.sample.bimbo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import common.BaseClass;
import common.Mailing;

public class Fileupload extends BaseClass {
	
@Test
	
	public void display1() throws InterruptedException{
		
	System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
		driver.get("http://www.flipkart.com/");
		

	

	
		

	}

}
