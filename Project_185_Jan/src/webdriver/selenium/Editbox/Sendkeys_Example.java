package webdriver.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname"))
		.sendKeys("ajay"+Keys.TAB
				+"Kishan"+Keys.TAB
				+"ajaykishan@gmail.com"+Keys.TAB);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("reg_email_confirmation__"))
		.sendKeys("ajaykishan@gmail.com"+Keys.TAB+"hello123456");
		
		
		//Selecting dropdown using sendkeys [Don't follow this method]
		//[To select dropdown option webdriver have separate commands]
		driver.findElement(By.id("day")).sendKeys("26");
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		

	}

}
