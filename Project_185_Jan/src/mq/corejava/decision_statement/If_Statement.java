package mq.corejava.decision_statement;

public class If_Statement {

	public static void main(String[] args)
	{
		
		
		/*
		 * if:-->
		 * 		=> If only accept boolean statement.
		 * 		=> If usefull to execute any block of statement.
		 */
		
		int Age=18;
		if(Age>18)
		{
			System.out.println("Statement1");
			System.out.println("Statement2");
			System.out.println("Statement3");
		}
		
		System.out.println("Run completed");
		
		//Only Single Statement to execute in if statement
		if(Age==18)
			System.out.println("Status pending");
		
			

	}

}
