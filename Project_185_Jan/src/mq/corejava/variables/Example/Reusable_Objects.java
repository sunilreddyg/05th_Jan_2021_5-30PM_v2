package mq.corejava.variables.Example;

import org.openqa.selenium.By;

public class Reusable_Objects 
{
	public static By login_email=By.xpath("//input[@id='email']");
	public static By login_password=By.xpath("//input[@id='pass']");
	public static By login_submit_button=By.xpath("//button[@data-testid='royal_login_button']");
}
