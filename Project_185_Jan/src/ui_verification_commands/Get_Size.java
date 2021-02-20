package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement Regular_Fare_Element=driver.findElement(By.cssSelector("ul[class='specialFare'] >li:nth-child(1)"));
		Dimension Obj_dim=Regular_Fare_Element.getSize();
		
		int Obj_height=Obj_dim.getHeight();
		System.out.println("Object height is ---> "+Obj_height);
		
		int Obj_width=Obj_dim.getWidth();
		System.out.println("Object width is ----> "+Obj_width);
		
		
		//Veifying object visibility using height and width
		if(Obj_height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object hidden at webpage");
		
	}

}
