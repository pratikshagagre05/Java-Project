package calculator;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 
		 System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
		 int x= sc.nextInt();
		 int operation=0; 
		 switch(x) {
		 case 1 : operation= n1+n2; break;
		 case 2 : operation= n1-n2; break;
		 case 3: operation=n1*n2; break;
		 case 4 : operation=n1/n2;break;
		// case 5 : operation=; break;
		 
		 
		default:System.out.println("Choice out Of range.");
		
		 }
		 System.out.println("Result = "+operation);


	}

}
