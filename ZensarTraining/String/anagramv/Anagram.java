package anagramv;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Anagram
{
	public static boolean checker(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2)
		{
			return false;
		}
		char[] a1=s1.toCharArray();
		char [] a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(a1.equals(a2))
		{
			return true;
		}
		return true;
		
	}

	public static void main(String[] args) {
	

	System.out.println("enter");
	Scanner sc= new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	checker(str1,str2);
	if(checker(str1,str2))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}

}
}