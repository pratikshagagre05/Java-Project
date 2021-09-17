package forEach;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=sc.nextInt();
			al.add(temp);
		}
		for(int i:al)
		{
			System.out.print(i+" ");
		}
	}

}
