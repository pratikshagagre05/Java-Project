package secondSmallestNumber;
import java.util.Arrays;
public class SecondSmalest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };
		int len=array.length;
		Arrays.sort(array);
		System.out.println(array[1]);
		
		/*for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
				if(i<array.length-1)
				{
					System.out.println(secondSmallest);
				}
				else
				{
					
				}
			}
		}
		
		System.out.println("Second Smallest Element : "+secondSmallest);
	}*/

	}
}
