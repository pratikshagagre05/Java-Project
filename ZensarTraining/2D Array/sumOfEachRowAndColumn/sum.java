package sumOfEachRowAndColumn;

public class sum 
{
	public static void main(String[] args) {
		int a[][]= {{23,43,49},{12,9,78},{66,39,0}};
		//int b[][]= {{31,51,57},{20,18,86},{74,47,8}};
		int sum1=0;
		System.out.println("Sum Of Each Row : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum1+=a[i][j];
			}
			System.out.println(i+" row sum : "+ sum1);
		}
		System.out.println("Sum Of Each Column : ");
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum+=a[j][i];
			}
			System.out.println(i+" column sum : "+ sum);
		}
	}
}
