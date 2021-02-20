package corejava.Variables;

public class Variable_Initiation {

	public static void main(String[] args) 
	{
		//local initiation [ Variable declared Inside method we can't access outside method]
		int a=100;
		System.out.println("value is => "+a);
		
		
		
		/*
		 * 		variable initiation with conditions
		 * 		=> Global Initiation up to Condition only.
		 */
		int b=0;
		if(true)
		{
			 b=20;
			System.out.println("Inside Condition => "+b);
		}
		
			System.out.println("Outside condition => "+b);

			
		//Variable initiation with loops
		int c=1;  //Global variable for [Loop]
		for (int i = 0; i <= 10; i++) 
		{
			String name="MQ";
			System.out.println("Loop inside local variable => "+name);
			c=c+i;
			
		}
		System.out.println("total value is => "+c);
		
	}

}
