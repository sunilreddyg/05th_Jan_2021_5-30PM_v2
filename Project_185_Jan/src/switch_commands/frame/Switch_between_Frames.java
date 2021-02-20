package switch_commands.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_between_Frames {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //Switch to frame using ID/name property
	    driver.switchTo().frame("menuFrame");
	    
	    WebElement Fee_Structure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    Fee_Structure.click();
	    Thread.sleep(4000);
	    
	    //Get controls back to webpage from menu frame
	    driver.switchTo().defaultContent();
	    //Switch to frame using Frame WebElement Reference
	    WebElement Body_frame_WebElement=driver.findElement(By.xpath("//frame[@title='bodyFrame']"));
	    driver.switchTo().frame(Body_frame_WebElement);
	    
	   //Selecting dropdown under bodyframe
	    new Select( driver.findElement(By.xpath("//select[@id='univ']")))
	    .selectByIndex(3);
	    
	    //Get controls back to mainpage
	    driver.switchTo().defaultContent();

	}

}
