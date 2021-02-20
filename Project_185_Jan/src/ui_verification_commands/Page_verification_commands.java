package ui_verification_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_verification_commands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//gettitle mehtod return current window title
		String runtime_title=driver.getTitle();
		System.out.println("Page title is ---> "+runtime_title);
		
		//getCurrentUrl method return current winow url
		String runtime_url=driver.getCurrentUrl();
		System.out.println("page url is ---> "+runtime_url);
		
		//Method return current window dynamic id 
		String runtime_windowid=driver.getWindowHandle();
		System.out.println("Dynamic window id is ---> "+runtime_windowid);
		
		//Method return entire pagesource into string format
		String page_source=driver.getPageSource();
		System.out.println(page_source);
		
		
	}

}
