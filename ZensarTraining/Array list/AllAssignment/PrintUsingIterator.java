package AllAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			Integer a=itr.next();
			System.out.print(a+" ");
			if(a==7)
				itr.remove();
		}
		System.out.print("\nAfter Iterator \n"+al+" ");

	}

}
