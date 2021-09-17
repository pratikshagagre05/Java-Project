package AllAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MatchTwoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(10,8,11,4,5,32,7));
		ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(32,8,7,5,4,11,10));
		
		Collections.sort(a1);
		Collections.sort(a2);
				
		boolean isEqual=a1.equals(a2);
		System.out.println(isEqual);
	}

}
