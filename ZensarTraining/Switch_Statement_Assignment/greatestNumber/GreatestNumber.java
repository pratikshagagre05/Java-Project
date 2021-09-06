package greatestNumber;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int num3=n1>n2?1:0;
		switch(num3)
		{
		case 1:System.out.println(n1+" is greater than "+n2);break;
		case 0:System.out.println(n2+" is greater than "+n1);break;
		default:System.out.println("They may be Equal");
		}
		
	}

}
