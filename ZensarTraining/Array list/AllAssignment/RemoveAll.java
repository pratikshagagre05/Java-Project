package AllAssignment;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);

	}

}
