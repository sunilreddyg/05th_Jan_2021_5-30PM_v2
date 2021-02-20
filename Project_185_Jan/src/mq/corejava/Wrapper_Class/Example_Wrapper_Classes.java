package mq.corejava.Wrapper_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_Wrapper_Classes {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		//Wrapper Class
		Window win=driver.manage().window();
		win.maximize();
		win.getSize();
	
		//Wrapper Class
		Options Opt=driver.manage();
		System.out.println(Opt.getCookies());
		
		
		//Wrapper Class
		By Locator_firstname=By.xpath("//input[@name='firstname']");
		WebElement Object_Firstname=driver.findElement(Locator_firstname);
		Object_Firstname.clear();
		Object_Firstname.sendKeys("Newuser");

		//Wrapper Class
		By Locator_month=By.xpath("//select[@id='month']");
		WebElement Obj_Month=driver.findElement(Locator_month);
		Select Month_Selector=new Select(Obj_Month);
		Month_Selector.selectByIndex(4);
		
	
	}

}
