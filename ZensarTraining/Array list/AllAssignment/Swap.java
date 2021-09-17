package AllAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Swap 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.print(al+" ");
		
		Collections.swap(al, 1, 2);
		System.out.println("\nAfter Swapping :");
		System.out.print(al+" ");
	
	}
	

}
