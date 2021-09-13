package twoD3by4;

import java.util.Scanner;

public class TwoD3by4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 by 4 array elements : ");
		int col=0;
		int [][]a=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=sc.nextInt();
				
			}	
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}	
			System.out.println();
		}
		
		
	}

}
