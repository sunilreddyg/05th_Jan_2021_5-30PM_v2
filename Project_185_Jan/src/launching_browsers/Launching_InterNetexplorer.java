package launching_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launching_InterNetexplorer {

	public static void main(String[] args)
	{
		/*
		 * Download IEDriverSever for webdriver:-->
		 * 		
		 * 	=> https://www.selenium.dev/downloads/
		 * 	=> Under The InternetEplorer driver server download
		 * 				w.r.t to hotspot size
		 * 	Note:-> Make sure IEDriverServer version should match
		 * 				with selenium version.
		 * 	=> After completed download unzip file to backup folder
		 *  => Set Runtime Environment variable path for IE browser.
		 *  
		 *  Configurations:-->
		 *  		=> IE 8,9,10 Versions browser zoom level should be 100%
		 *  		=> All protected policies should be off.[Privacy and Security Tabs]
		 *  					Navigation:--> Tools--> Internet Options
		 *  
		 */
		
		//Set Temporary environment path for IEDriver Server..
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		
		//Launch IE browser window
		InternetExplorerDriver ie=new InternetExplorerDriver(); 
		ie.get("http://google.com");   //Load webpage to window
		
		System.out.println(ie.getTitle());   //It print current window title
		
		ie.close();    //It Close browser window
		
		
	}

}
