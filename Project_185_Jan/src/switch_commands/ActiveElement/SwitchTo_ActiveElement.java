package switch_commands.ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		/*
		 * activeElement:-->
		 * 			method switch control on active element at webpage and return 
		 * 			element as WebElement.
		 */
		
		
		driver.findElement(By.id("Sug_locsugg")).sendKeys("HYD");
		Thread.sleep(2000);
		WebElement WE=driver.switchTo().activeElement();
		WE.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		
		driver.findElement(By.xpath("//input[@id='cjaExp']")).click();
	
		WebElement Act_element=driver.switchTo().activeElement();
		Thread.sleep(2000);
		Act_element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
	}

}
