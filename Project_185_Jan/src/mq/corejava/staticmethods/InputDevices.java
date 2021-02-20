package mq.corejava.staticmethods;

public class InputDevices 
{
	
	public static void keyboard()
	{
		System.out.println("keyboard active");
	}
	
	
	public static void Mouse()
	{
		System.out.println("Mouse active");
	}
	

	public static void main(String[] args) 
	{
		/*
		 * In main method static access specifier allowed
		 * other static method to call without object creation.
		 */
		
		keyboard();
		Mouse();
		/*
		 * When calling method and called method available with in class
		 * No need to include classname. [Only for static methods]
		 */
	}

}
