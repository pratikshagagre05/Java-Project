package areaOfShapes;

import java.util.Scanner;

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		float pi=3.14f;
		
		System.out.println("1. Area of Circle\n2. Area of Square\n3. Area of Right Angle Triangle" );
		System.out.println("4. Area of Rectangle\n5. Circumference of a Circle\n6. Perimeter Of Square");
		float result=0.00f;
		System.out.println("Enter Choice :");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter radius");
				int r=sc.nextInt();
				result=pi*r*r;
				break;
		case 2: System.out.println("Enter sides");
				int s1=sc.nextInt();
				result=s1*s1;
				break;
		case 3: System.out.println("Enter Two lenth");
				int l1=sc.nextInt();
				int l2=sc.nextInt();
				result=(float)(l1*l2)/2;
				break; 
		case 4: System.out.println("Enter Two sides");
				int s2=sc.nextInt();
				int s3=sc.nextInt();
				result=s2*s3;
				break;
		case 5: System.out.println("Enter radius");
				int r1=sc.nextInt();
				result=2*pi*r1;
				break; 
		case 6: System.out.println("Enter sides");
				int s4=sc.nextInt();
				result=4*s4;
				break;
		default: System.out.println("Choice Out of range");
		}
		System.out.println("Result = "+result);
	}		
}


