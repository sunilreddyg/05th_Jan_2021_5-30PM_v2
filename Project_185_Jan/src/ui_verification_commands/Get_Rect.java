package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement Regular_Fare_Element=driver.findElement(By.cssSelector("ul[class='specialFare'] >li:nth-child(1)"));

		System.out.println("Obj X coordinates are---> "+
							Regular_Fare_Element.getRect().getX());
	}

}
