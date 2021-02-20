package mq.corejava.staticmethods;

public class Run_InputDevices_From_Other_Class 
{

	public static void main(String[] args) 
	{
		/*
		 * Inorder to call static specifier method from different
		 * class we should include classname.
		 * 
		 * 			Classname.methodname();
		 */
		
			InputDevices.keyboard();
			InputDevices.Mouse();
		
	}

}
