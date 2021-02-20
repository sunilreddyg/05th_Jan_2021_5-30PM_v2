package switch_commands.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

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
	  
	    //Switching to alert and wrapped alert into Interface class
	    Alert alert=driver.switchTo().alert();
	    
	    //Get text on alert
	    String alert_msg=alert.getText();
	    System.out.println(alert_msg);
	    
	    //Close alert
	    alert.accept();  //This line close alert and bring controls back to webpage
	    
	    driver.close();

	}

}
