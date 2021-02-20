package switch_commands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Window_Using_Iterators {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				

		//Get All dynamic window ID's
		Set<String> All_windowsIDs=driver.getWindowHandles();
		//Convert Set of String into iterators
		Iterator<String> itr=All_windowsIDs.iterator();
		
		/*
		 * Each iterator can access with Next keyword
		 */
		String Train_Reservation=itr.next();
		driver.switchTo().window(Train_Reservation);
		System.out.println("w1 title is --->"+driver.getTitle());
		
		String Seat_Availability=itr.next();
		driver.switchTo().window(Seat_Availability);
		System.out.println("w2 title is --->"+driver.getTitle());
		
		String Pnr_status=itr.next();
		driver.switchTo().window(Pnr_status);
		System.out.println("w3 title is --->"+driver.getTitle());
		
		
		
	}

}
