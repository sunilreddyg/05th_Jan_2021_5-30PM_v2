package mq.corejava.instantmethods;

public class RobotE
{
	
	void Turn_ON()
	{
		System.out.println("Robot is turned on");
	}
	
	void Walk()
	{
		Turn_ON();     //With in class any instant method can call witout object creation
		System.out.println("Robot started walking");
	}
	
	void Run()
	{
		Turn_ON();
		System.out.println("Robot started running");
	}

	public static void main(String[] args) 
	{
		new RobotE().Walk();
	}

}
