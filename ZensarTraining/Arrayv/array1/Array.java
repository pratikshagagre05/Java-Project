package array1;
import java.util.*;

public class Array {
	int []a;
	public Array() {
		 a=new int[5];
	}
	Scanner sc=new Scanner(System.in);
	public void insertArray()
	{
		System.out.println("Enter Element:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
					
		}
	}
	
	public void showtArray()
	{
		System.out.println("Array Element:");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
					
		}
	}
	public void evenArray()
	{
		System.out.println("\nEven Numbers : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
	public void oddArray()
	{
		System.out.println("Odd Index Numbers : ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
				System.out.println(a[i]);
		}
	}
	public void oddArraySum()
	{
		//System.out.println("sum of Odd Numbers : ");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of Odd Numbers : " + sum);
	}
	public void enhancefor()
	{
		System.out.println("Array Element using Enhance For Loop");
		for(int val:a)
		{
			System.out.println(val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a=new Array();
		a.insertArray();
		a.showtArray();
		a.evenArray();
		a.oddArraySum();
		a.oddArray();
	}

}
