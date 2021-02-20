package webdriver.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_InterFace 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();    //Optional
		
		System.out.println(driver.getTitle());  //Printing current brower window title
		System.out.println(driver.getCurrentUrl());
		driver.close();  
		
		/*
		 * Exceptions:-->
		 * 	=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 		IllegalStateException:-->
		 * 			When Chromdriver.exe file not located
		 * 			under current system.
		 * 
		 * 	=> driver.get("http://google.com");
		 * 		
		 * 		SessionNotCreated:-->
		 * 			Exception display when browserdriver
		 * 			version mismatch with browser version.
		 * 
		 * 		InvalidArgumentException:-->
		 * 			When Url defined without http:// or https://
		 * 	
		 * 			Invalid:-->    driver.get("www.google.com");
		 * 			Valid:---->	   driver.get("http://google.com");
		 */
		
		
		
		
		
	}

}
