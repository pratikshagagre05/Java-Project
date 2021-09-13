package palindrome;

import java.util.Scanner;

public class Palindrome {
	public static boolean checker(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		checker(s);
		if(checker(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
}
}
