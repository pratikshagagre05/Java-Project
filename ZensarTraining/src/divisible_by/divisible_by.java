package divisible_by;
import java.util.*;
public class divisible_by {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean divisible=false;
		if(number % 5==0 && number % 11==0)
		{
			divisible=true;
		}
		else
		{
			divisible=false;
		}
		
		if (divisible==true)
		{
			System.out.println(number+" is divisible by 5 and 11 ..");
		}
		else
			System.out.println(number+" is not divisible by 5 and 11 ..");

	}

}
