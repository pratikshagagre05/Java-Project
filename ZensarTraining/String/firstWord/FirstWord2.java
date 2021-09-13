package firstWord;

import java.util.Scanner;

public class FirstWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String words="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '||str.charAt(i)==','||str.charAt(i)=='?'||str.charAt(i)==';'||str.charAt(i)=='.')
			{
				System.out.println(words);
				count++;
				words="";
			}
			else
				words+=str.charAt(i);
		}
		System.out.println("Count = "+count);
		
	}
		
}
