package interactions.TouchActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Touch_Interactions {

	public static void main(String[] args) {
		
		/*
		 * try scenario only in mobile app..
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sketchtoy.com/");
		driver.manage().window().maximize();
		
		
		//Enable touch action on automation browser
		TouchActions touch=new TouchActions(driver);
		
		WebElement New_Tab=driver.findElement(By.xpath("//div[@title='New sketch']"));
		touch.singleTap(New_Tab).perform();
		
		

	}

}
