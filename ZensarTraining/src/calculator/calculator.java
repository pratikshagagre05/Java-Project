package calculator;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = n1+n2;
		int n4=n1-n2;
		int n5=n1*n2;
		System.out.println("ADDITION = "+ n3);
	    System.out.println("SUSTRACTION = "+ n4);
		System.out.println("MULTIPLICATION = "+ n5);
		System.out.println("DIICSION = "+ n1/n2);
	}

}
