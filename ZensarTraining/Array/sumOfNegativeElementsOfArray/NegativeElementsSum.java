package sumOfNegativeElementsOfArray;

public class NegativeElementsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[] {1,2,-3,-4,-5,6,-7};
		int count=0;
		int sum=0; 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("\nInt array Sum : "+sum);
		System.out.println("Count : "+count);
		

	}

}
/*WAP to print all negative elements in an array and also count total
number of negative elements in an array. */
