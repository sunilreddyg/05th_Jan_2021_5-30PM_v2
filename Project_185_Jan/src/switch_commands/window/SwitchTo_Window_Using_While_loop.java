package switch_commands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Window_Using_While_loop {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				

		//Get All dynamic window ID's
		Set<String> All_windowsIDs=driver.getWindowHandles();
		//Convert Set of String into iterators
		Iterator<String> itr=All_windowsIDs.iterator();
		
		String Homepage=itr.next();  //Read First iterator value
		
		//While loop accept iteration and eject loop when iteration completed
		while(itr.hasNext())
		{
			//Read next iterator value and switch to window using iterator value
			String eachwindow=itr.next();
			driver.switchTo().window(eachwindow);
			
			//Get every runtime window title
			String Runtime_title=driver.getTitle();
			System.out.println(Runtime_title);
			//Break loop when expected window title matches
			if(Runtime_title.contains("Seat Availability"))
			{
				break;
			}
		}
		System.out.println("Current window title is ---> "+driver.getTitle());
		
		//switch to mainwindow
		driver.switchTo().window(Homepage);
		System.out.println("Homepage title is ---> "+driver.getTitle());

	}

}
