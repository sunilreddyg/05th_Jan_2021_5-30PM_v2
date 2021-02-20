package ui_verification_commands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Page_VisibleText {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenaio:--> Verifying Email validation with Invalid Email Entry
		 * 			Given site url is http://outlook.com
		 * 			When User click on Sign in navigation button
		 * 			And Type invalid email entry
		 * 			And click on Next button
		 * 			Then verify appropriate error message displayed
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		WebElement SignIn_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		SignIn_btn.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		Thread.sleep(2000);
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(4000);
		
		WebElement page=driver.findElement(By.tagName("body"));
		String page_visible_text=page.getText();
		//System.out.println(page_visible_text);
		
		String Exp_err_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		//Condition to verify any text contains at page visible text
		if(!page_visible_text.contains(Exp_err_msg))
			System.out.println("Testpass, Expected msg displayed at webpage");
		else
			System.out.println("Testfail,Expected msg not display");
	}

}
