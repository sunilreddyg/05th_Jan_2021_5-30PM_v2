package mq.corejava.variables.Example;

public class Run_by_user2 {

	public static void main(String[] args) {
		
		//Create object for Reusable programs
		Reusable_programs obj=new Reusable_programs();
		
		//Set Runtime Driverpath and Url
		obj.Driver_path="C:\\Users\\Administrator\\Desktop\\browser_drivers\\";
		obj.url="http://facebook.com";
		obj.Launch_chrome();
		
		//Set Username and passwords at runtime
		obj.username="darshan@gmail.com";
		obj.password="rsrt@2015";
		obj.user_login();
		
	}

}
