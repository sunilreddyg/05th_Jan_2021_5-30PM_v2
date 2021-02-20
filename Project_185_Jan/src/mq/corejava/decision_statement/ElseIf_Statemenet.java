package mq.corejava.decision_statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElseIf_Statemenet {

	public static void main(String[] args) 
	{

		/*
		 * ElseIF:-->
		 * 		Multiple Decisions to Execute
		 */
		
		String browser="chrome";
		
		if(browser.equals("ie"))
		{
			System.out.println("Ie brower launched");
		}
		else if(browser.equals("chrome"))
		{
			System.out.println("chrome browser launched");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("firefox browser launched");
		}
		else
		{
			System.out.println("browser mismatch");
		}
		
		
		
		
		/*
		 * In selenium Browser launch program with else if condition...
		 */
		
		String browser_name="firefox";
		WebDriver driver=null;
		if(browser_name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser_name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
			System.out.println("browsername mismatch");
		
		driver.get("http://google.com");
		
		

	}

}
