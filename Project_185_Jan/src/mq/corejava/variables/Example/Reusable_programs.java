package mq.corejava.variables.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_programs 
{
	
	WebDriver driver=null;
	String Driver_path=null;
	String url=null;
	String username=null;
	String password=null;
	
	public void Launch_chrome()
	{
		System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void user_login()
	{
		//Wrap element into Reusable variable
		WebElement UID_Object=driver.findElement(Reusable_Objects.login_email);
		UID_Object.clear();
		UID_Object.sendKeys(username);
		
		WebElement PWD_Object=driver.findElement(Reusable_Objects.login_password);
		PWD_Object.clear();
		PWD_Object.sendKeys(password);
		
		driver.findElement(Reusable_Objects.login_submit_button).click();
	}
	

}
