package account1;

public class AccountConstructor {
	public long account_no;
	public String customer_name;
	public AccountConstructor()
	{
		long a = 0;
		String n="";
		account_no=a;
		customer_name=n;
		System.out.println("I am in Dfault Constructor");
		
	}
	public AccountConstructor(long a,String n)
	{
		account_no=a;
		customer_name=n;
		System.out.println("I am in Parametrize Constructor");
		
	}
	
	public static void main(String []a)
	{
		AccountConstructor acc;
		acc=new AccountConstructor();
		acc=new AccountConstructor(145236563,"gydhfjdg");
				
	}
}