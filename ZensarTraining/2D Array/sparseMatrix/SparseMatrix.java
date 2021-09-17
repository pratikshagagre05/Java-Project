package sparseMatrix;

public class SparseMatrix {
	public static boolean checker(int a[][],int m,int n)
	{
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>((m*n)/2))
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		int [][]a= { { 1, 0, 3 }, { 0, 0, 4 }, { 6, 0, 0 } };
		int m=3;
		int n=3;
		if(checker(a, m, n))
			System.out.println("Sparse Matrix");
		else
			System.out.println("Not Sparse Matrix");
	}
}
