package neg_pos_zero;
import java.util.*;
public class neg_pos_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number == 0)
		{
			System.out.println(number+" is equals to zero..");
			
		}
		else if(number > 0)
		{
			System.out.println(number+" is grater than zero..");
		}
		else
		{
			System.out.println(number+" is less than zero..");
		}
	}

}
