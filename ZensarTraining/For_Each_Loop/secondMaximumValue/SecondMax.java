package secondMaximumValue;

import java.util.Arrays;

public class SecondMax {
//*****This works only if maximum no is in last position.******
	public static void main(String[] args) 
	{
		int[] a=new int[] {5,6,3,7,2,9,10,8};
		Arrays.sort(a);
		int l=a.length;
		System.out.println(a[l-2]);
		
	}
}
//*****This works only if maximum no is in last position.******
/*int[] a=new int[] {5,6,3,7,2,9,10,8};
int max=a[0];
int r=0;
for(int i:a)
{
	if(max<i)
	{
		r=max;
		max=i;
	}
}
System.out.println(r);
}*/