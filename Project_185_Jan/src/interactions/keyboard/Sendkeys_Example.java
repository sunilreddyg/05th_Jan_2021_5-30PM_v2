package interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example 
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
			
		WebElement Location=driver.findElement(By.id("Sug_locsugg"));
		new Actions(driver).sendKeys(Location, "HYD")
		.pause(4000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		
		

	}

}
