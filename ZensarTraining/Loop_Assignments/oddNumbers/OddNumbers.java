package oddNumbers;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i=start;
		while(i<=end)
			//for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
