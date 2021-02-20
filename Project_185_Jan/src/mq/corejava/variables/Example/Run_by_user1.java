package mq.corejava.variables.Example;

public class Run_by_user1 {

	public static void main(String[] args) 
	{
		
		//Create object for Reusable programs
		Reusable_programs obj=new Reusable_programs();
		
		//Set Runtime Driverpath and Url
		obj.Driver_path="Drivers\\";
		obj.url="http://facebook.com";
		obj.Launch_chrome();
		
		//Set Username and passwords at runtime
		obj.username="info.dsnr@gmail.com";
		obj.password="Dsnr@2015";
		obj.user_login();
	}

}
