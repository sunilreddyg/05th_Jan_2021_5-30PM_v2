package mq.corejava.method_parameters;

public class RobotH 
{
	//Method Parameter
	public void walk()
	{
		System.out.println("Speed is 11");
	}
	
	//Method with single parameter
	public void walk(String speed)
	{
		System.out.println("Walk speed is => "+speed);
	}
	
	//method with multiple parameters
	public void walk(String name,int speed)
	{
		System.out.println(name+" Walk speed is => "+speed);
	}
	
	

	public static void main(String[] args) {
		
		//Calling method without argument
		new RobotH().walk();
		
		//Calling method with Argument
		new  RobotH().walk("18");
		
		//Calling method with multiple argumetns
		new RobotH().walk("Chitti", 14);
		
	}

}
