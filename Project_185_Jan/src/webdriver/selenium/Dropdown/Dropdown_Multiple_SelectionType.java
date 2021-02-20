package webdriver.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_SelectionType {

	public static void main(String[] args) throws Exception {
		
		/*
		 * FAQ:--> How to verify dropdown is accept multiple option selection
		 * Ans:-->
		 * 			boolean flag=new Select(WebElement).isMultiple();
		 * 			S.o.p(flag);
		 */
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
	    driver.manage().window().maximize();
	    
	    
	    boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
	    System.out.println("Dropdown Multiple Selection State is --> "+flag);
	    
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
	    
	    
	    
	}

}
