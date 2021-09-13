package averageHeaders;

public class AverageHeaders {

	public static int average(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}
	public static double average(double[] array)
	{
		double sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[] {1,2,3,4,5,6};
		double [] b=new double[] {1,2,3,4,5,6};
		System.out.println("Int array Sum : "+average(a));
		System.out.println("Double array sum : "+average(b));

	}

}
/*Write two methods that return the average of an array with following headers.
a. public static int average(int[] array)
b. public static double average(double[] array).
*/
