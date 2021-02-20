package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssSelector_Values {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
	
		WebElement Regular_Fare_Element=driver.findElement(By.cssSelector("ul[class='specialFare'] >li:nth-child(1)"));
		String Runtime_object_Bg_color=Regular_Fare_Element.getCssValue("background-color");
		System.out.println(Runtime_object_Bg_color);
		
		if(Runtime_object_Bg_color.contains("rgba(0, 140, 255, 1)"))
			System.out.println("Expected Object Selected");
		else
			System.out.println("Expected object not selected");
		
		
		//Get text size available at object
		String Font_size=Regular_Fare_Element.getCssValue("font-size");
		System.out.println("Text size ---> "+Font_size);
		
		
		

	}

}
