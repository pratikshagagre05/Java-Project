package tableOfNumber;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int table=1;
		for(int i=1;i<=10;i++)
		{
			table=num*i;
			System.out.println(table);
		}
		
	}

}
