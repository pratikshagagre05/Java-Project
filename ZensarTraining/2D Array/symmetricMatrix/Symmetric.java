package symmetricMatrix;

public class Symmetric 
{
	public static boolean checker(int a[][],int m,int n)
	{
		int[][] transpose=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					transpose[i][j]=a[j][i];
				}
			}
		}
	System.out.println("Transpose Matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(transpose[i][j]==a[i][j])
				{
					return true;
				}
				else
					return false;
			}
	
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		int [][]original= { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int m=3;
		int n=3;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(original[i][j]+" ");
			}
			System.out.println();
		}
		
		if(checker(original, m, n)==true)
		{
			System.out.println("Symmetric Mattrix");
		}
		else
			System.out.println("Not a Symmetric Matrix");
		
	}
	

}
