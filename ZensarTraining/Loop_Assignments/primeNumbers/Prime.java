package primeNumbers;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		//int count=0
		int i =0 ,num=0;
		for(i=start;i<=end;i++)
		{
			int count=0;
			for(int j=i;j >=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				count=0;
			}
		}

	}

}
