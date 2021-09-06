package evenORodd;
import java.util.*;
public class evenORodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number=sc.nextInt();
		if (number % 2==0)
		{
			System.out.println(number+" is Even..");
		}
		else
		{
			System.out.println(number+" is Odd..");
		}

	}

}
