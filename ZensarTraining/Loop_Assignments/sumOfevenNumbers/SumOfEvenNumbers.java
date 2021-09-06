package sumOfevenNumbers;
import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even numbers : "+sum);
	}

}
