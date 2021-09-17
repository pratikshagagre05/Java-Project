package transposeMatrix;

public class Transpose {
	public static void checker(int a[][],int m,int n)
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
	}
	public static void main(String[] args) 
	{
		int [][]original= { { 1, 0, 3 }, { 0, 0, 4 }, { 6, 0, 0 } };
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
		
		checker(original, m, n);
		
	}
}
