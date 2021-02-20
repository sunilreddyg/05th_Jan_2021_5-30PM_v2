package webdriver.selenium.Other_Objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip_FlightSearch {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://makemytrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Select radio button
	    driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	    
	    //Click to Departure City list..
	    driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
	    //Type Referral City Code name
	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
	    Thread.sleep(5000);
	    //select City from suggesstions
	    driver.findElement(By.xpath("//p[contains(.,'Hyderabad, India')]")).click();
	    
		 //Click on arrival city list
	     driver.findElement(By.xpath("//span[contains(.,'To')]")).click();
	     //Type referral city code name
	     driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("PNQ");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//p[contains(.,'Pune, India')]")).click();
	     
	     
	     //click Departure date label
	     driver.findElement(By.xpath("//span[contains(.,'DEPARTURE')]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[@aria-label='Thu Jan 28 2021']")).click();
	     Thread.sleep(4000);  //To load return date
	     driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(.,'236538')]")).click();
	     
	     
	     
	     
	     
	     
	     
	}

}
