package AllAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(20,24,12,13,25,26));
		Object[] b1=al.toArray();
		for(Object i : b1)
		{
			System.out.print(i+" ");
		}
	}

}
