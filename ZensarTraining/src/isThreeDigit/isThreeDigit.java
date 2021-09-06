package isThreeDigit;
import java.util.*;
public class isThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number=scanner.nextInt();
		if(number>99 && number<1000)
		{
			System.out.println(number+" is a three digit number");
			int first_digit=number%10;
			
			//System.out.println(n1);
			int last_digit=number/100;
			//System.out.println(n2);
			int sum=first_digit + last_digit;
			System.out.println("Sum of First and Last digit = "+ sum);
		}
		else 
		{
			System.out.println(number+" is not a three digit number");
		}

	}

}
