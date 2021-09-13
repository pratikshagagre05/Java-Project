package emailVerification;

import java.util.Scanner;

public class EmailVerify {

	public void acceptEmail()
	{
		System.out.println("Enter Email");
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		checkEmail(email);
		
	}
	public void checkEmail(String e)
	{
		String emailpattern="^[a-zA-Z0-9]+[.a-zA-Z0-9]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}$";
		if(e.matches(emailpattern))
			{
				System.out.println("email is valid");
			}
			else
			{
				System.out.println("Email is not valid");
	
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailVerify e=new EmailVerify();
		e.acceptEmail();

	}

}
