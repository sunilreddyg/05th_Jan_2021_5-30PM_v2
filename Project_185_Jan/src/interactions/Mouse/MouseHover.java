package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		
		
		WebElement Tools_mainmenu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Tools')]"));
		//Perform Hover action on Selected Element
		new Actions(driver).moveToElement(Tools_mainmenu).perform();
		Thread.sleep(4000);
		
		
		WebElement Naukri_labs_tools_SubMenu=driver.findElement(By.xpath("//a[@title='Naukri Lab']"));
		new Actions(driver).click(Naukri_labs_tools_SubMenu).perform();
		
		
		

	}

}
