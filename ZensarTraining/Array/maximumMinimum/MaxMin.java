package maximumMinimum;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Maximum Element : "+max);
		System.out.println("Minimum Element : "+min);
	}

}
