package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement Regular_Fare_Element=driver.findElement(By.cssSelector("ul[class='specialFare'] >li:nth-child(1)"));
		Point Obj_point=Regular_Fare_Element.getLocation();
		
		int Obj_x=Obj_point.getX();
		System.out.println("X coordinates of object is ---> "+Obj_x);
		
		int Obj_y=Obj_point.getY();
		System.out.println("Y coordinates of object is ----> "+Obj_y);
		
		//Verify object visibility using page coordinates
		if(Obj_x > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("object hidden at webpage");
		
		
	}

}
