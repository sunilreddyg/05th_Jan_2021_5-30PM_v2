package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Private_Window {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Get Current Window Dynamic ID
		String Main_window=driver.getWindowHandle();
		System.out.println(Main_window);
		
		
		
		WebElement pnr_status_link=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']"));
		pnr_status_link.click();   //This command open page at new window/tab..
		Thread.sleep(4000);
		
		System.out.println("Current Window title before switch is --> "+driver.getTitle());
		
		//Get window Handles
		Set<String> allwindow_ids=driver.getWindowHandles();
		for (String EachWindowID : allwindow_ids) 
		{
			if(!EachWindowID.equals(Main_window))
			{
				driver.switchTo().window(EachWindowID);
				break;
			}
		}
		
		
		System.out.println("Current window title is --> "+driver.getTitle());
		
		
		//Get Controls back to Mainwindow
		driver.switchTo().window(Main_window);
		System.out.println("Homepage title is ---> "+driver.getTitle());

	}

}
