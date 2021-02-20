package mq.corejava.instantmethods;


public class RobotD 
{
	public RobotD()
	{
		System.out.println("default Instance");
	}
	//Instant Method [Instant doesn't contain static keyword]
	public void Start_walk()
	{
		System.out.println("Start Walking");
	}
	
	//Instant Method [Instant doesn't contain static keyword]
	public void Stop_Walking()
	{
		System.out.println("Stop Walking");
	}

	public static void main(String[] args) 
	{
		  RobotD obj=new RobotD();
		  obj.Start_walk();
		  obj.Stop_Walking();
	}
	
	
	/*
	 * => Inorder to call instant method from same class using
	 * 	  main method we should create object to class.
	 * 		
	 * 			Syntax:-->  new ClassName().methodname();
	 * 
	 * 			new ---> Is a keyword only access class constructor
	 * 			.   ---> on Constructor .[Dot] operator list out methods 
	 * 						and variable under class
	 * 
	 * 			Syntax:-->
	 * 					Classname obj=new ClassName();
	 * 					obj.methodname();
	 * 
	 */

}
	



