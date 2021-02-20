package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_page_Source 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String runtime_pageSource=driver.getPageSource();
		String ElementId="email";
		
		//Condition to verify expected element presented in the source
		if(runtime_pageSource.contains(ElementId))
		{
			driver.findElement(By.id("email")).sendKeys("9030248855");
		}
		else
			System.out.println("Element not presented in source");

		
		//Password element using try catch...
		try {
			driver.findElement(By.id("pass")).sendKeys("hello12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Run Continued");
		
		
		
		
		
		
		
	}

}
