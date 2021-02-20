package webdriver.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//click signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type email and Hit Enter Key
		driver.findElement(By.id("i0116")).clear();
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com",Keys.ENTER);
		
		Thread.sleep(5000); //Java timeout
		
		
		//Type password and hit enter key
		driver.findElement(By.id("i0118")).clear();
		driver.findElement(By.id("i0118")).sendKeys("Hello12345",Keys.ENTER);
		
		
	}

}
