package AllAssignment;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println(al);
		al.remove(1);
		System.out.println("After Removing: ");
		System.out.println(al);
	}

}
