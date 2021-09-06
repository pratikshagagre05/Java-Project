package leap_year;

import java.util.Scanner;

class leap_year {
	
	public static void main(String args[])
	{	
		boolean leap = false;
		System.out.println("Enter Year to check : ");
		Scanner sc = new Scanner(System.in);
		int year =sc.nextInt();
		if(year%4==0) {
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap = true;
				}
				else
					leap=false;
			}
			else
				leap=true;
		}
		else
			leap=false;
		
		if (leap==true)
			System.out.println(year+" is a leap year....");
		else
			System.out.println(year+" is not a leap year....");
		
	}
}
