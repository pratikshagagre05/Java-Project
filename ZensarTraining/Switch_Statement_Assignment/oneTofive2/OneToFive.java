package oneTofive2;

import java.util.Scanner;

public class OneToFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number Between 1 to 5");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		String output="";
		switch(n1) {
		case 1:output="1"; break;
		case 2:output="2";break;
		case 3:output="v3v";break;
		case 4:output="4";break;
		case 5:output="5";break;
		default : System.out.println("Out of Range");
		}
		System.out.println(output);

	}

}
