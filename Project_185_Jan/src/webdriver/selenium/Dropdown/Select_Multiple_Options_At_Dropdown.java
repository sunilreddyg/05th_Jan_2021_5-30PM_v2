package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Options_At_Dropdown {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Faq:--> How to select multiple option under dropdown.
		 * Ans:--> Repeat Selection command multiple times
		 * 		[Ther is no separate command for multiple slelection]
		 */
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
	    driver.manage().window().maximize();
	    

	    /*
	     * Converting single selection dropdown into multile selection dropdown using
	     * javascript executor.
	     * 			[Don't try this ]
	     */
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	    
	    
	    boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
	    System.out.println("Dropdown Multiple Selection State is --> "+flag1);
	    
	    //Accept Condition only when dropdown is multiple selection type
	    if(flag1==true)
	    {
	    	Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
	    	State_Dropdown.deselectAll();   //Deselection only possible on multple selection dropdown
	    	State_Dropdown.selectByIndex(3);
	    	State_Dropdown.selectByIndex(5);
	    	State_Dropdown.selectByIndex(7);
	    	
	    	System.out.println(State_Dropdown.getAllSelectedOptions().size());
	    }
	    else
	    {
	    	System.out.println("Dropdown is not a multiple selection type");
	    }
	    
	    
	    
	    

	}

}
