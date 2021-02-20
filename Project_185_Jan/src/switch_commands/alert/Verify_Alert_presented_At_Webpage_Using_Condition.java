package switch_commands.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Verify_Alert_presented_At_Webpage_Using_Condition {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    //Conditiont overify alert presented
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	//Switching to alert and wrapped alert into Interface class
		    Alert alert=driver.switchTo().alert();
		    
		    //Get text on alert
		    String alert_msg=alert.getText();
		    System.out.println(alert_msg);
		    
		    //Close alert
		    alert.accept();  //This line close alert and bring controls back to webpage
		    
	    }
	    else
	    {
	    	System.out.println("Alert not presented");
	    }
	    
	    
	    
	    
	    
	    
	    
	  
		
		

	}

}
