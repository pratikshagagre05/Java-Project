package subtrachTwoMatrix;

public class subtracT {
	public static void main(String[] args) {
		//update value
		int a[][]= {{23,43,49},{12,9,78},{66,39,0}};
		int b[][]= {{31,51,57},{20,18,86},{74,47,8}};
		int result [][]=new int[3][3];	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				result[i][j]=b[i][j]-a[i][j];
			}
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
