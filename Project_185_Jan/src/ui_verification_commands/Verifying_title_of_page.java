package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verifying_title_of_page {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//gettitle mehtod return current window title
		String runtime_title=driver.getTitle();
		System.out.println("Page title is ---> "+runtime_title);
		
		String exp_title="SeleniumHQ Browser Automation";
		
		//Verify Expected title with runtime title
		boolean flag=runtime_title.equals(exp_title);
		
		//Write a decision to Continue execution of correct title
		if(flag==true)
		{
			System.out.println("Selenium Homepage title verified");
			WebElement download_btn=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			download_btn.click();
			
			//Verify Download page title
			if(driver.getTitle().equals("Downloads"))
				System.out.println("Download page title verified");
			else
				System.out.println("Download page title not verified");
				
		}
		else
			System.out.println("Selenium Homepage title not verified");
		
		
		
		
		/*
		 * Testng Title Verification:-->
		 * 		Assert.assertEquals(driver.getTitle(),"Exp_title");
		 */
		
		

	}

}
