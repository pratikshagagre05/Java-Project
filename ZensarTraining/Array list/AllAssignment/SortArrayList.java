package AllAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(4);
		al.add(2);
		al.add(8);
		System.out.print(al+" ");
		Collections.sort(al);
		System.out.print("\nAfter Sorting \n"+al+" ");

	}

}
