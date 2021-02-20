package switch_commands.window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window_using_Target_Property {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //Get Current focused Dynamic window ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    //Switch to frame using frame id
	    driver.switchTo().frame("message");
	    
	    //Click Report link under message frame
	    WebElement Reports=driver.findElement(By.xpath("//a[@href='Reports.html']"));
	    Reports.click();
	    
	    //Get control back to mainpage
	    driver.switchTo().defaultContent();
	    
	    //Switch to frame using FrameID
	    Thread.sleep(5000);
	    driver.switchTo().frame("bodyFrame");
	    
	    /*Clicking external link under bodyframe  [This link open in separate tab/window]
	     * HtmlSource:-->
	     * <a href="collegeregistrationreport.do" target="_new">Colleges Registration Status</a>
	     */
	    WebElement College_reg_link=driver.findElement(By.xpath("//a[@href='collegeregistrationreport.do']"));
	    College_reg_link.click();
	    
	    //Switch to next window using extenal link target property
	    Thread.sleep(5000);
	    driver.switchTo().window("_new");
	    System.out.println("Focus available at => "+driver.getTitle());
	    String sub_windowID=driver.getWindowHandle();
	    
	    //Identify object at new window
	     WebElement  AC_Year=driver.findElement(By.xpath("//select[@name='ac_year']"));
	     new Select(AC_Year).selectByIndex(3);
	    
	  
	    //Get Controls back to mainwindow
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Focus available at => "+driver.getTitle());
	    
	    //Get Control back to sub window
	    driver.switchTo().window(sub_windowID);
	    System.out.println("Sub window title is ---> "+driver.getTitle());
	    
	    /*
	     * Note:-->
	     * 			don't use target property when it was designed as blank
	     * 			<a href="http://registration.com"  target="_blank"> linkname </a>
	     */
	    
	    
	    
	  
	}

}
