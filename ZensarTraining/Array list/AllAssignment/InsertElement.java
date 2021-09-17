package AllAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println(al);
		al.add(1, 10);
		System.out.println("After Addition : ");
		System.out.println(al);
		
	}

}
