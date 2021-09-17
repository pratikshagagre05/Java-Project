package AllAssignment;

import java.util.ArrayList;

public class Retain {
//retainAll() return all same Elements in both list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(4);
		System.out.println(al);
		al.retainAll(al1);
		System.out.println(al);

	}

}
