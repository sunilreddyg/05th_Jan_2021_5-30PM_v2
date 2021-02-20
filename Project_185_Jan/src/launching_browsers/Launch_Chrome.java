package launching_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe application file using below navigation
		 * 		=> https://sites.google.com/a/chromium.org/chromedriver/downloads
		 * 		=> Download chromedriver w.r.t chrome browser version.
		 * 		=> for example  [Chromebrowser is 87.0 version download chromedriver 87 version]
		 * 		=> Select Operating system and click on Zip format link
		 * 					[Win32 support 64 hotspot and 34 hotspot]
		 * 		=> It Download Zip format file 
		 * 		=> Unzip file into local drive [You receive chromedriver.exe file]
		 * 	--------------------------------------------------------
		 * 		Create Folder Under Projet and name it as "drivers"
		 * 		Copy chromedriver.exe file into "drivers" folder
		 * 		set temprarory Environment variable path before launch 
		 * 					chrome browser using webdriver.
		 * 
		 * 		System.SetProperty("webdriver.chrome.driver","Chromedriver.exe path");
		 * 
		 */
		
		
		//Set Runtime Environment variable for chrome browser
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		ChromeDriver chrome=new ChromeDriver();     //It launch Browser
		chrome.get("http://facebook.com");          //It Load page at browser
		
		
		//Print Title of Page
		System.out.println(chrome.getTitle());
		
		//Close browser window
		chrome.close();
		
		
	}

}
