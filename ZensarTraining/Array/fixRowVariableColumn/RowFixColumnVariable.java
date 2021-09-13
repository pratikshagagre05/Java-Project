package fixRowVariableColumn;

import java.util.Scanner;

public class RowFixColumnVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int col=0;
			int [][]a=new int[3][];
			for(int i=0;i<3;i++)
			{
				System.out.println("Row : "+i);
				System.out.println("How many columns in row "+i);
				col=sc.nextInt();
				a[i]=new int[col];
				for(int j=0;j<col;j++)
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
