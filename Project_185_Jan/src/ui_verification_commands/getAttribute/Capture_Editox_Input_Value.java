package ui_verification_commands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Editox_Input_Value {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify departure date showind 	
		 * 				default date as current system date.
		 */
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Departure_Textbox=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		//Get Editbox input value at runtime
		String Runtime_input_value=Departure_Textbox.getAttribute("value");
		System.out.println(Runtime_input_value);
		
		//Create date object
		Date d=new Date();
		System.out.println(d.toString());
		//Create simple date formatter
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Convert date using simple date formatter
		String Sdate=sdf.format(d);
		System.out.println(Sdate);
		
		if(Runtime_input_value.equals(Sdate))
			System.out.println("Testpass, System date showing as default date");
		else
			System.out.println("Testfail, Default date mismatch with system  date");
		
		
		
		

	}

}
