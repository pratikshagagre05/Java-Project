package TwoDArray;
import java.util.Scanner;
public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Rows ?");
		int row=sc.nextInt();
		int col=0;
		int [][]a=new int[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("How many colimns in row"+i);
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
		
		for(int i=0;i<a.length;i++)
		{
			int min = a[i][0];
			int j;
			for( j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min =a[i][j];
				}
					
			}	
			System.out.println("min = "+a[i][j]);
		}
		
		
		
		
	}

}
