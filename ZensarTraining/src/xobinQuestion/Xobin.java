package xobinQuestion;
import java.util.*;
public class Xobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		int num=1;
		for(int i=0;i<index;i++)
		{
			num+=i;
		}
		System.out.println(num);
	}

}
