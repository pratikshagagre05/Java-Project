package twoDigitInList;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDigit {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int temp=sc.nextInt();
			list.add(temp);
		}
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(list.get(i)>=10 && list.get(i)<100)
			{
				count++;
			}
		}
		System.out.println("Count : "+count);
	}

}
