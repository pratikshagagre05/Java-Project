package ovelORconsonant;
import java.util.*;

public class ovelORconsonant {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char alphabet= sc.next().charAt(0);
		
		if (alphabet=='a' || alphabet=='A' || alphabet=='e' || alphabet=='E' ||
				alphabet=='i' || alphabet=='I' || alphabet=='o'
			|| alphabet=='O' || alphabet=='u' || alphabet=='U')
			{
					System.out.println(alphabet+" a is Vovel..");
					
		}
		else
		{
			System.out.println(alphabet+" is a consant..");
		}
		
		// TODO Auto-generated method stub

	}

}
