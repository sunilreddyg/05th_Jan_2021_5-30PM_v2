package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_page_url 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		
		//Get Current page url
		String runtime_url=driver.getCurrentUrl();
		String Exp_url="https://www.selenium.dev/";
		
		//Write a Conditional statement to accept on valid url presented
		if(runtime_url.contains(Exp_url))
		{
			System.out.println("Homepage url verified");
			WebElement download_btn=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			download_btn.click();
			
			//Verify downlods page url
			if(driver.getTitle().contains("downloads/"))
				System.out.println("Downloads page url verified");
			else
				System.out.println("Downloads page url not verified");
			
		}
		else
			System.out.println("Hompage url not verified");
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
