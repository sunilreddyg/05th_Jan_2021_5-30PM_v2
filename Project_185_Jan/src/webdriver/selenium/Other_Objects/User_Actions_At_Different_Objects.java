package webdriver.selenium.Other_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class User_Actions_At_Different_Objects {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);   //Static  timeout to close cookies notification window at bottom of page
	    
	    //Selecting Radio button  [In Webdrive radio button to select we follow "click" method]
	    driver.findElement(By.id("RoundTrip")).click();
		
	    
	    /*
	     * AutoCompleteEditbox:-->
	     * 			=> These editboxes doesn't allow user to type complete text
	     * 			=> user should type any referrence characters
	     * 			=> it display list of suggesstions
	     * 			=> User need to pick one sugesstions from list.
	     */
	    driver.findElement(By.id("FromTag")).clear();
	    driver.findElement(By.id("FromTag")).sendKeys("HYD");
	    Thread.sleep(4000);   //Timeout load sugesstions
	    driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
	    System.out.println("Hyderabad option listed and selected");
	    
	    
	    driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("DEL");
	    Thread.sleep(4000);
	    driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
	    
	    
	    //Select Date form date picker   [I will cover this during groupelements concept]
	    driver.findElement(By.linkText("29")).click();
	    Thread.sleep(2000);
	    
	    //Type Text into DatePicker Editbox [Only possible when editbox box in redable format]
	    driver.findElement(By.id("ReturnDate")).clear();
	    driver.findElement(By.id("ReturnDate")).sendKeys("Sat, 27 Feb, 2021"+Keys.ESCAPE);
	    
	    //Select Dropdown option
	    new Select(driver.findElement(By.id("Adults"))).selectByIndex(3);
	    
	    //Click Link to Open more options
	    driver.findElement(By.partialLinkText("More options:")).click();
	    
	    
	    
	    
	    
	    
	    
	}

}
