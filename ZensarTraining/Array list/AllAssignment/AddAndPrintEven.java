package AllAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAndPrintEven 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<51;i++)
		{
			al.add(i);
		}
		for(int i=0;i<51;i++)
		{
			if(al.get(i)%2==0)
				System.out.print(al.get(i)+" ");
		}
		
	}

}
