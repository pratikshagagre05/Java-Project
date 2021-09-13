package emailValidate;

import java.util.Scanner;

public class InvalidEmailException extends RuntimeException{
	public String errmsg;
	public InvalidEmailException()
	{
	}
	public InvalidEmailException(String err)
	{
		errmsg=err;
	}
	public void showError()
	{
		System.out.println(errmsg);
	}
}
class ValidateEmail extends InvalidEmailException
{
	public void acceptEmail()
	{
		System.out.println("Enter Email");
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		checkEmail(email);
		
	}
	public void checkEmail(String e)
	{
		String emailpattern="^[a-zA-Z0-9]+[.][a-zA-Z0-9]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}$";
		try
		{
			if(e.matches(emailpattern))
			{
				System.out.println("email is valid");
			}
			else
			{
				throw new InvalidEmailException("Email is not valid");
	
			}
		}
		catch(InvalidEmailException i)
		{
			
			i.showError();
		}
	}
	public static void main(String[] args) {
		ValidateEmail e=new ValidateEmail();
		e.acceptEmail();
	}
}
