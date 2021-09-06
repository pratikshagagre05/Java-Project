package account;
import java.util.*;

public class Accountdata {
	public String name,acc_no,adhar_no;
	int mob_no, deposite,withdraw,total;
	Scanner sc=new Scanner(System.in);
	public void insert(String x,String y,int z,String a)
	{
		name=x;
		acc_no=y;
		mob_no=z;
		adhar_no=a;
	}
	
	public void Deposite(int d)
	{
		deposite=d;
	}
	public void Withdraw(int w)
	{ 
		withdraw=w;
		total=deposite-withdraw;
	}	
	
	public String getName()
	{
		return name;
	}
	public String getAcc_no()
	{
		return acc_no;
	}
	public int getMob_no()
	{
		return mob_no;
	}
	public String getAdhar_no()
	{
		return adhar_no;
	}
	public int getDeposite()
	{
		return deposite;
	}
	public int getWithdraw()
	{
		return withdraw;
	}
	
	
	public void display()
	{
		System.out.println("Account Holder Name : "+getName());
		System.out.println("Account Holder Account Number : "+getAcc_no());
		System.out.println("Account Holder Mobile number : "+getMob_no());
		System.out.println("Account Holder Adhar number : "+getAdhar_no());
		System.out.println("Deposite Ammount : "+getDeposite());
		System.out.println("Total Ammount : "+total);


	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountdata a= new Accountdata();
		a.insert("vdfgd","gdfyghd",56853428,"hdfgyuefh");
		a.Deposite(1000);
		a.Withdraw(200);
		a.display();
		
	

	}

}
