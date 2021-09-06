package oneTofive1;

import java.util.Scanner;

public class OneToFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number Between 1 to 5");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		String output="";
		switch(n1) {
		case 1:output="One"; break;
		case 2:output="Two";break;
		case 3:output="Three";break;
		case 4:output="Four";break;
		case 5:output="Five";break;
		default : System.out.println("Out of Range");
		}
		System.out.println(output);

	}

}
