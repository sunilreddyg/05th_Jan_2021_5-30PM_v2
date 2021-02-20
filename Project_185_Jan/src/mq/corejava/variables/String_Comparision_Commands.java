package mq.corejava.variables;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:-->
		 * 		String is a non primitive datatype and called
		 * 		as class.
		 * Why String is a class?
		 * 		Because string contains set of method
		 * 		to validate store chracters.
		 */
		
		
		/*
		 * equal:-->
		 * 		method verify equal comparision between two
		 * 		strings and boolean value true/false.
		 * 		Note:--> Equal is case-sensitive comparision
		 */
		String act_res="Account Created";
		String exp_res="account created";
		
		boolean flag=act_res.equals(exp_res);
		System.out.println("Equal comparision is ----> "+flag);
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify any string equal comparision by 
		 * 		ignoring case-sensitive and returb boolean value true/false
		 */
		boolean flag1=act_res.equalsIgnoreCase(exp_res);
		System.out.println("Equal ignorecase comparison is ---> "+flag1);
		
		/*
		 * contains:-->
		 * 			Method verify substring available at main String
		 * 			and return boolean value true/false
		 */
		String Status="Account Created 101 Sucessfull";
		boolean flag2=Status.contains("Account Created");
		System.out.println("Sub string contains at main string --> "+flag2);
		
		
		/*
		 * subString:-->
		 * 			Method return substring characters from
		 * 			main string.
		 */
		String Account_num="000012458888";
		String sub=Account_num.substring(4, 8);
		System.out.println("Middle characters are --->"+sub);
		
		
		String Last_digits=Account_num.substring(8);
		System.out.println("Last 4 digit numbers are ---> "+Last_digits);
		

		/*
		 * Startswith:-->
		 * 			method verify given string starts with expected
		 * 			characters and return boolean value true/false.
		 */
		String Ifsc_code="HDFC000012";
		boolean flag4=Ifsc_code.startsWith("HDFC");
		System.out.println("String starts with ---> "+flag4);
		
		/*
		 * Ends_with:-->
		 * 		Method verify given string ends with expected
		 * 		characters and return boolean value true/false
		 */
		boolean flag5=Ifsc_code.endsWith("12");
		System.out.println("String ends with -->"+flag5 );
		
		
		/*
		 * length:-->
		 * 			method return length of characters available
		 * 			at string and return value in integer..
		 */
		String mobile_num="9030248855";
		int len=mobile_num.length();
		System.out.println("Number of characters available --> "+len);
		
		/*
		 * trim:--> method trim extrs spaces available at string
		 * 			[Left and right spaces only]
		 */
		String pincode="     77878787       ";
		System.out.println("Pincode before trim ---> "+pincode.length());
		String new_pincode=pincode.trim();
		System.out.println("Pincode after trim ---> "+new_pincode.length());
		
		
		/*
		 * ToUppercase:-->
		 * 		Method convert all lowercase characters into uppercase
		 */
		String toolname="webdriver";
		System.out.println(toolname.toUpperCase());
		
		/*
		 * ToLowercase:-->
		 * 		Method convert all uppercase characters into lowercase
		 */
		String Code="XYZ1Abc2";
		System.out.println(Code.toLowerCase());
		
		/*
		 * isempty:-->
		 * 		method verify string empty status and return
		 * 		boolean value
		 */
		String var1="Hello";
		String var2="";
		System.out.println("Var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());
		
		
		
		
	}

}
