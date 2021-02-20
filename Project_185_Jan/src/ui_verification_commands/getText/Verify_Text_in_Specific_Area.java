package ui_verification_commands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_in_Specific_Area {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Departure_label=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		Departure_label.sendKeys(Keys.ENTER);
		Departure_label.sendKeys("GOA");
		Thread.sleep(4000);
		System.out.println("departure city clicked");
		
		//Target complete location of cities where it available
		WebElement Arrival_Cities_location=driver.findElement(By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR"));
		//Get all cities list into string format
		String Arrival_cities=Arrival_Cities_location.getText();
		System.out.println(Arrival_cities);
		
		//Verify Expected city not available in selected area
		if(!Arrival_cities.contains("Goa (GOI)"))
			System.out.println("Testpass, Selected departure city name not displayed in arrival cities list");
		else
			System.out.println("Testfail, Selected Departure cittname displayed in arrival city list");
		
		
		
		
	}

}
