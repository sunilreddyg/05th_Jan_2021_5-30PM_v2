package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifying_Html_Object {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//Identify objects and typing text init
		driver.findElement(By.id("u_0_n")).sendKeys("Krishna");
		driver.findElement(By.name("lastname")).sendKeys("Chaitanya");
		driver.findElement(By.name("reg_email__")).sendKeys("harsha6037@gmail.com");
		driver.findElement(By.id("u_0_v")).sendKeys("harsha6037@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Hello1234");
		
	
	}

}
