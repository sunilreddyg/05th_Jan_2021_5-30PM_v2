package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Wrapper_Element {

	public static void main(String[] args) {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
	    driver.manage().window().maximize();
	    
	    WebElement State_Dropdown=driver.findElement(By.id("customState"));
	    State_Dropdown.findElements(By.tagName("option")).get(4).click();
	    
	}

}
