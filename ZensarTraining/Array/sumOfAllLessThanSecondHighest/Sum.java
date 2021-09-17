package sumOfAllLessThanSecondHighest;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
	public static void checker()
	{
		System.out.println("******************Anagram********************");//Write A Separate function 
		String str1="jeet";
		String str2="teek";
		char s1[]=str1.toCharArray();
		char s2[]=str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		int result =0;
		for(int i=0;i<str1.length();i++)
		{
			if(s1[i]!=s2[i])
			{
				result=0;
				break;
			}
			else
				result=1;
		}
		if (result==1)
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
		
		
	}

	
	public static void checker1()
	{
		System.out.println("******************3 is Present or not********************");//Write A Separate function 
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		
		String str3=String.format("%d",number);
		/*if(number<0)
		return false;
		
		System.out.println(str3);
		
		  Integer i=new Integer(number); String str=i.toString();
		  System.out.println(str);
		 
		  String str=String.format("%d",number);
		 */
		char b[]=str3.toCharArray();
		char temp='3';
		for(char c:b)
		{
			if(c==temp)
			{
				//return true;
				System.out.println("yes present.");
			}
			
		}
		//return true;

		
		
	}
	public static void main(String[] args) 
	{
		int a[]= {5,4,12,8,9,10,43,7,3,1};
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<a.length-3;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum : "+sum);
		
		checker();
		checker1();
	}
	
}
