package sumOfDiagonalElements;

public class SumOgDIagonalElements {
	public static void main(String[] args) {
		int a[][]= {{23,43,49},{12,9,78},{66,39,0}};
		int b[][]= {{31,51,57},{20,18,86},{74,47,8}};
		int result [][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					result[i][j]=b[i][j]-a[i][j];
				}
				else
					result[i][j]=0;
			}
			
		}
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				System.out.print(result[j][k]+" ");
			}
			System.out.println();
			
		}
	}

	}


