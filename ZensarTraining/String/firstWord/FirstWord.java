package firstWord;

import java.util.Scanner;

public class FirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				result=str.substring(0, i);
				System.out.println(result);
			break;
			}
		}
		
	}

}
