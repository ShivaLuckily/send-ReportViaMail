package com.sample.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import common.BaseClass;

public class ScrollBar {
	
	@Test
	
	public void display() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shipra Mandal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
					driver.get("http://www.snapdeal.com/");
					
					//JavascriptExecutor jsx = (JavascriptExecutor)driver;
					//jsx.executeScript("window.scrollBy(0,100)", "");
					//Thread.sleep(3000);
					//jsx.executeScript("window.scrollBy(0,100)", "");
					JavascriptExecutor jse =(JavascriptExecutor)driver;
					jse.executeScript("scroll(0,650)");
					Thread.sleep(3000);
					jse.executeScript("scroll(0,1000)");
					
					

			}
	}
//JavascriptExecutor jse =(JavascriptExecutor)driver;jse.executeScript("scroll(0,250)");

//oR
//Robot robot= new Robot();
//robot.mouseWheel(25);

