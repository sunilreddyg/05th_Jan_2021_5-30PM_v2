package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option_Count {

	public static void main(String[] args) 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/");
	    driver.manage().window().maximize();
	    
	    //Selecting dropdown option using index number [Selected Adults 9]
	    new Select(driver.findElement(By.id("Adults"))).selectByIndex(8);
	 
	    //Children dropdown doesn't show any options
	    Select Children_selector=new Select(driver.findElement(By.id("Childrens")));
	    int Count=Children_selector.getOptions().size();
	    
	    if(Count < 2)
	    {
	    	System.out.println("Testpass, Childrens are not showing any options");
	    }
	    else
	    {
	    	System.out.println("Testfail, Childresn are showing morethan 1 options");
	    }
	    	

		
		
	}

}
