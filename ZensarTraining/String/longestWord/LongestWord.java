package longestWord;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char []a=str.toCharArray();
		String word="";
		//You are special because you have a more knowledge.
		int length=str.length();
		int size=0;
		String []words=new String[50];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' '){    
	              word = word + str.charAt(i);    
	          }    
	          else{    
	              //Add word to array words    
	              words[size] = word;    
	              //Increment length    
	              size++;    
	              //Make word an empty string    
	              word = "";    
	          }    
		} 
		String small="",large ="";
		small=large=words[0];
		for(int i=0;i<size;i++)
		{
			if(words[i].length()<small.length())
			{
				small=words[i];
			}
			if(words[i].length()>large.length())
			{
				large=words[i];
			}
		}
		System.out.println(small);
		System.out.println(large);
	}
}

