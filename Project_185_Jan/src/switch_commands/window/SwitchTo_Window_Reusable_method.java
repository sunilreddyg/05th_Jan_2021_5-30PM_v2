package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Window_Reusable_method {

	static WebDriver driver;
	
	public static void switchto_window(String Exp__window_title)
	{
		//Get All Dynamic window Id's
		Set<String> allwindow_ids=driver.getWindowHandles();
		//Iterate for each window ID using foreach loop
		for (String eachwindowid : allwindow_ids) 
		{
			//Switch to every window 
			driver.switchTo().window(eachwindowid);
			
			//Get Active window title
			String Runtime_title=driver.getTitle();
			
			if(Runtime_title.contains(Exp__window_title))
			{
				break;   //Break iteration and keep control where title matches
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		
		switchto_window("Cancel Train Bookings");
		System.out.println("Current active window title is --> "+driver.getTitle());
		
		switchto_window("Rail Tour Packages");
		System.out.println(driver.getTitle());
	}

}
