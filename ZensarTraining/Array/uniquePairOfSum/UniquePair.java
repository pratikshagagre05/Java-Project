package uniquePairOfSum;
import java.util.Scanner;
public class UniquePair {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[] {1,2,3,4,5,6};
		System.out.println("Enter Sum value : ");
		int value=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[i]+a[j])==value)
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
					
			}
		}
	}

}
