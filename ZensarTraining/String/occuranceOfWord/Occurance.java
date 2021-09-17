package occuranceOfWord;

import java.util.Arrays;

public class Occurance {
	public static void main(String[] args)
	{
		String str="How do you do ";
		int size=0;
		String words[]=new String[5];
		String word="";
		//int size=0;
		String search="do";
		 int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{    
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
	
		for(int i=0;i<size;i++)
		{
			//System.out.println(words[i]);
			if(words[i].equals(search))
			{
				//System.out.println("yes");
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println("*************Another Way*************");
		String a[]=str.split(" ");
		int c=0;
		for(String temp:a)
		{
			if(temp.compareTo(search)==0)
			{
				c++;
			}
		}
		System.out.println(c);
		System.out.println("************Another Way****************");
		for(int i=0;i<size;i++)
		{
			//System.out.println(words[i]);
			if(words[i].equals(search))
			{
				
				count++;
			}
		}
		System.out.println(c);		 
	}

}
