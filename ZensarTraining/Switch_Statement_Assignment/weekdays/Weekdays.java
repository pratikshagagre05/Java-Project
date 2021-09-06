package weekdays;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int x= sc.nextInt();
		 String weekday=""; 
		 switch(x) {
		 case 1 : weekday="1 - Monday"; break;
		 case 2 : weekday="2 - Tuesday"; break;
		 case 3 : weekday="3 - Wedenesday"; break;
		 case 4 : weekday="4 - Thuresday";break;
		 case 5 : weekday="5 - Friday"; break;
		 case 6 : weekday="6 - Saturday"; break;
		 case 7 : weekday="7 - Sunday";break;
		default:System.out.println("Day does not Exist.");
		
		 }
		 System.out.println(weekday);
	}

}
