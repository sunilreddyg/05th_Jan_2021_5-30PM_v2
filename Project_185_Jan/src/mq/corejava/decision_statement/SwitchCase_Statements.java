package mq.corejava.decision_statement;

public class SwitchCase_Statements {

	public static void main(String[] args)
	{
		
		/*
		 * Switch-case:-->
		 * 		=> switch execute multiple decisions same
		 * 			as else if. only diff switch execute
		 * 			only selected case instead verifing
		 * 			everfy case. 
		 */		
		
		String month="apr";
		
		switch (month)
		{
		case "jan":
			System.out.println("10% discount");
			break;
			
		case "feb":
			System.out.println("20% discount");
			break;

		case "mar":
			System.out.println("30% discount");
			break;
		
		case "apr":
			System.out.println("40% discount");
			break;

		default:  System.out.println("month name mismtach");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
