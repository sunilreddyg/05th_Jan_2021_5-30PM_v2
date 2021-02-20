package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectin_Dropdown_option {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * FAQ:--> How to deselect any single option from multiple selection dropdown
		 * Requirement:-->
		 * 				Client is expecting user can modify selection..
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
	    	//Selecting multiple option at dropdown
	    	Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
	    	State_Dropdown.deselectAll();   //Deselection only possible on multple selection dropdown
	    	State_Dropdown.selectByIndex(3);
	    	State_Dropdown.selectByIndex(5);
	  
	    	
	    	//Get Selected Option Count
	    	int Selection_Count=State_Dropdown.getAllSelectedOptions().size();
		    	//Condition to verify Dropdown Selecton count
		    	if(Selection_Count ==2)
		    	{
		    			//Deselect single option from dropdown
		    			State_Dropdown.deselectByIndex(3);
		    			
		    			//Get Selection count after deselection
		    			int Dcount=State_Dropdown.getAllSelectedOptions().size();
		    			if(Dcount==1)
		    			{
		    				System.out.println("Successfully deselected single option from selection");
		    			}
		    			else
		    			{
		    				System.out.println("Failed to deselect single option from multiple selection");
		    			}
		    		
		    	}
		    	else
		    	{
		    		System.out.println("PreCondition Failed,Dropdown failed to select multiple options");
		    	}
	    
	  
	    }
	    else
	    {
	    	System.out.println("Dropdown is not a multiple selection type");
	    }
					    
			    
			   
	}

}
