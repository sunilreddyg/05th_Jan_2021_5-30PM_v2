package switch_commands.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_navigation_Command 
{

	public static void main(String[] args) throws Exception {
		
		/*
		 * Navigate frame witout using switch to frame command.
		 */

		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    
	    //This command navigate to Selected Frame window
	    driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
	    Thread.sleep(3000);
	    
	    //element UnderFrame
	    WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    email.clear();
	    email.sendKeys("qadarshan@gmail.com");
	    
	    //element UnderFrame
	    WebElement TripID=driver.findElement(By.xpath("//input[@name='tripid']"));
	    TripID.clear();
	    TripID.sendKeys("4654564");
	    
	    //Navigte to previous window
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    
	    WebElement Flights_icon=driver.findElement(By.xpath("//body/section[@id='GlobalNav']/div[1]/div[1]/ul[1]/li[1]/a[1]"));
	    Flights_icon.click();
	}

}
