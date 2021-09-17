package AllAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al1.add(9);
		al1.add(10);
		al1.add(11);
		al1.add(12);
		System.out.print("Before copying \n"+al+" ");
		Collections.copy(al, al1);
		System.out.print("\nAfter copying elements\n"+al+" ");

	}

}
