package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//Get Current Window Dynamic ID
		String Main_window=driver.getWindowHandle();
		System.out.println(Main_window);
		
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();   //This command open page at new window/tab..
		Thread.sleep(4000);
		
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
		
		System.out.println(driver.getTitle());
		//Type text into editbox at instagram window
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("9030248855");
		
		driver.close();  //Close Current active window
		
		//Switch controls back to Mainwindow
		driver.switchTo().window(Main_window);
		
		System.out.println("Current active window title is ----> "+driver.getTitle());
		
		
		
		
		
		
		
	}

}
