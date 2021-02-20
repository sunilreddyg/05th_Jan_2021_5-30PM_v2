package mq.corejava;

public class RobotB {

	//Constructor [Instance of Class]
	public RobotB() 
	{
		System.out.println("Void Message Turned on");
	}
	
	//Instant Method
	void Start_Walk()
	{
		System.out.println("Start walking");
	}
	
	//Instant method
	void Stop_Walk()
	{
		System.out.println("Stop Walking");
	}
	
	//Main method provide executable status to class.
	public static void main(String args[])
	{
		new RobotB().Start_Walk();
		new RobotB().Stop_Walk();
	}

}
