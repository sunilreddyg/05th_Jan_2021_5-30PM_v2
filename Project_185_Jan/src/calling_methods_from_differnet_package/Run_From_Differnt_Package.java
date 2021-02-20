package calling_methods_from_differnet_package;

import mq.corejava.instantmethods.RobotD;
import mq.corejava.staticmethods.InputDevices;

public class Run_From_Differnt_Package 
{

	public static void main(String[] args) 
	{
	
			/*
			 * Rule1:--> Only public modifier methods
			 * 			can access ouside package.
			 * Rule2:-->
			 * 			Inorder to call method/variable from different
			 * 			package we should import package into current Class.
			 */
		
		InputDevices.keyboard();
		InputDevices.Mouse();
		
		//Create object for class
		RobotD ref=new RobotD();
		ref.Start_walk();
		ref.Stop_Walking();
	}

}
