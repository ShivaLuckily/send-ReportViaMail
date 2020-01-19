package com.sample.Test;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import common.BaseClass;
import common.Mailing;

public class IETesting extends BaseClass{
		
	
	@Test	
     public	void display(){
		
		driver.get("www.gmail.com");
	}
	
	


}
