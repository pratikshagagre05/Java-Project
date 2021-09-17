package AllAssignment;

import java.util.ArrayList;

public class EmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		if(al.isEmpty())
			System.out.println("Array List is Empty");
		else
			System.out.println("ArrayList is Not empty.");

	}

}
