package bankDenomination;

import java.util.Scanner;

public class BankDenomination
{
		
	public static void denomination(int amount)
	{
		int[] notes = new int[] {2000,500,200,100,50,20,10,1};
		int[] notesCounter = new int[8];
		
		for (int i=0;i<8;i++)
		{
			if(amount >= notes[i])
			{
				notesCounter[i] = amount / notes[i];
				amount = amount - notesCounter[i] * notes[i];
				
			}
		}
		System.out.println("Denomination : ");
		for(int i=0;i<8;i++)
		{
			if(notesCounter[i]!=0)
			{
				System.out.println(notes[i]+" : "+notesCounter[i]);
			}
		}
		
	}
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 int x= sc.nextInt();
		 denomination(x);
	 }
	 
	     
}
