package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Option 
{

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
	    driver.manage().window().maximize();
	    
	    //Selecting dropdown using visible option name
	    new Select(driver.findElement(By.id("customState")))
	    .selectByVisibleText("Bihar");
	    Thread.sleep(4000);
	    
	  //Selecting drodpown using Option value
	    new Select(driver.findElement(By.id("customCity")))
	    .selectByValue("arrah");
	    
	    //Typing text into editbox
	    driver.findElement(By.id("customLocality"))
	    .sendKeys("Gandhi nagar");
	    
	    //selecting dropdown using index number..
	    new Select(driver.findElement(By.id("customRadius")))
	    .selectByIndex(4);
	    
	   //Selecting Checkbox [To select and Deselect checkbox we follow Click method]
	    driver.findElement(By.id("amenity_category_order_types50")).click();
	    
	    //Click Button using xpath identification
	    driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

	}

}
