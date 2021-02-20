package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Required_window {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
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
		
		
		//Get All Dynamic window Id's
		Set<String> allwindow_ids=driver.getWindowHandles();
		//Iterate for each window ID using foreach loop
		for (String eachwindowid : allwindow_ids) 
		{
			//Switch to every window 
			driver.switchTo().window(eachwindowid);
			
			//Get Active window title
			String Runtime_title=driver.getTitle();
			System.out.println(Runtime_title);
			
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;   //Break iteration and keep control where title matches
			}
		}
		
		System.out.println("Current active window title is --->"+driver.getTitle());
		
		


	}

}
