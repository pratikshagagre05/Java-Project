package squares_1to20;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(i*i);
		}

	}

}
