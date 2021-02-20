package switch_commands.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    
	    //Switch control From webpage to frame using FrameID
	    driver.switchTo().frame("modal_window");
	    Thread.sleep(2000);
	    
	    //element UnderFrame
	    WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    email.clear();
	    email.sendKeys("qadarshan@gmail.com");
	    
	    //element UnderFrame
	    WebElement TripID=driver.findElement(By.xpath("//input[@name='tripid']"));
	    TripID.clear();
	    TripID.sendKeys("4654564");
	    
	    
	    //Get Controls back to mainpage
	    driver.switchTo().defaultContent();
	    
	    WebElement Flights_icon=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
	    Flights_icon.click();

	}

}
