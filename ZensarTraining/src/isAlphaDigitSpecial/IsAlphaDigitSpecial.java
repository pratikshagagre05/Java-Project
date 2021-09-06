package isAlphaDigitSpecial;
import java.util.*;
public class IsAlphaDigitSpecial {
	
	static void charCheck(char input_char)
	{
		        if ((input_char >= 65 && input_char <= 90)
		            || (input_char >= 97 && input_char <= 122))
		            System.out.println(" Alphabet ");
		
		        else if (input_char >= 48 && input_char <= 57)
		            System.out.println(" Digit ");
		 
		        else
		            System.out.println(" Special Character ");
		    
	}
		    // Driver Code
	 public static void main(String[] args)
	   {
		    	Scanner sc=new Scanner(System.in);
		        char s=sc.next().charAt(0); 
		        charCheck(s);
	    }
		
	}

