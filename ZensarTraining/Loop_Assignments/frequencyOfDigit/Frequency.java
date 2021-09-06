package frequencyOfDigit;
import java.util.Scanner;
public class Frequency {
	static int frequencyDigits(int n, int d) {
		int c = 0;

		while (n > 0) {
			if (n % 10 == d)
				c++;
			n = n / 10;
		}
		return c;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		System.out.println(frequencyDigits(N, D));
	}
}


