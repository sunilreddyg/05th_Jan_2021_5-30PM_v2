package ui_verification_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute 
{

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:-->  Verify Roundtrip Selection State
		 * 			Given site url is "http://makemytrip.com"
		 * 			And verify default selection for oneway
		 * 			When user click on Return date\
		 * 			Then selection changes to Roundtrip radio button
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Oneway_Sbtn=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Oneway_runtime_class=Oneway_Sbtn.getAttribute("class");
		
		//Decision to verify oneway selection
		if(Oneway_runtime_class.contains("selected"))
		{
			System.out.println("Default selection available for oneway");
			WebElement ReturnDate=driver.findElement(By.xpath("//label[contains(.,'RETURNTap to add a return date for bigger discounts')]"));
			ReturnDate.click();
			Thread.sleep(4000);
			
			WebElement Roundtrip_Sbtn=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String roundtrip_runtime_class=Roundtrip_Sbtn.getAttribute("class");
			//Decision to verify Roundtrip selection
			if(roundtrip_runtime_class.contains("selected"))
				System.out.println("Testpass, Selection available for roundtrip");
			else
				System.out.println("Tesfail,Roundtrip is not selected");
		}
	}

}
