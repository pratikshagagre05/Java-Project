package occuranceOfCharacter;

import java.util.Scanner;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Occurance of Letter");
		char occ=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(occ==str.charAt(i))
				count++;
		}
		System.out.println("Count of Character "+occ+" = "+count);
	}

}
