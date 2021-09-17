package AllAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class RetriveElementsWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Search Elment : ");
		int s=sc.nextInt();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==s)
				System.out.println("Element is Present at index position "+i);
			
		}

	}

}
