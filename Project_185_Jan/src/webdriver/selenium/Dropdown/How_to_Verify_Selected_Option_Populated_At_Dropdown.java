package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class How_to_Verify_Selected_Option_Populated_At_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Faq:--> How to Verify required options selected at dropdown
		 */
		

		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
	    driver.manage().window().maximize();
	    
	    //Selecting dropdown option using index number
	    Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
	    State_Dropdown.selectByIndex(3);
	    
	    //This syntax return first selected option name..
	    String OptionName=State_Dropdown.getFirstSelectedOption().getText();
	    System.out.println("Selected Option at dropdown  -is--> "+OptionName);
	    
	    //Condition to verify required option selected at dropdown
	    if(OptionName.equals("Andhra Pradesh"))
	    {
	    	System.out.println("Testpass, Required option selected");
	    }
	    else
	    {
	    	System.out.println("Testfail, Failed to selec required dropdown options");
	    }
	    
	    Thread.sleep(5000);
	    driver.close();
	    
	    
	    
	    	
	    	
	    
	}

}
