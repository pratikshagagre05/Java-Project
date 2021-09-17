package average;

public class Average 
{
	public static void main(String[] args)
	{
		int a[]={ 23, 55, 54, 9, 76, 66, 2, 91 };
		int l=a.length;
		int sum=0;
		for(int i : a)
		{
			sum+=i;
		}
		System.out.println("Average : ");
		System.out.println(sum/l);

	}
}
