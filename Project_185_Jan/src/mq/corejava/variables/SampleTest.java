package mq.corejava.variables;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		
		String url=chrome.getCurrentUrl();
		System.out.println(url);
		
		String title=chrome.getTitle();
		System.out.println(title);
	}

}
