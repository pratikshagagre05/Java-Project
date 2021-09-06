package check_Krishnamurthy;

import java.util.Scanner;

public class Krishnamurthy {

	public int factorial(int x)
	{
		int res = 1;
		while (x != 0) {
			res = res * x;
			x--;
		}

		return res;
	}

	public boolean checker(int number) 
	{
		int sum = 0;
		int temp = number;
		while (temp != 0) {
			sum = sum + factorial(temp % 10);
			temp = temp / 10;
		}
		if (sum == number) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) 
	{
		System.out.println("Emter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Krishnamurthy k = new Krishnamurthy();
		if (k.checker(num))
			System.out.println("It is a Krishnamurthy Number.");
		else
			System.out.println("It is not a Krishnamurthy number.");

	}

}
