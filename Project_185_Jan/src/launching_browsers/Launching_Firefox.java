package launching_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox 
{

	public static void main(String[] args)
	{
		
		/*
		 * Download geckodriver
		 * 		=> https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 * 		=> Click on geckodriver releases
		 * 		=> Select geckodriver release w.r.t firefox browser
		 * 		=> Under Asserts download zip format file w.r.t Operating
		 * 					system and hotspot size  
		 * 		=>     for   >60 browser version download  [0.28.0] download geckodriver verision
		 * 		=> Downlaod zipformat file in backup folder
		 * 		=> Set runtime environment variable before launch firefox browser.

		 */
	
		
		//Setting runtime environment variable for firefox browser
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		
		//Launch firefox browser using webdriver command
		FirefoxDriver firefox=new FirefoxDriver();
		
		//Load webpage at firefox browser window
		firefox.get("http://facebook.com");    
		
		//Printing title of facebook page
		System.out.println(firefox.getTitle());
		
		//Browser termination using webdriver command
		firefox.close();
		System.out.println("firefox closed successfull");
		
		

	}

}
