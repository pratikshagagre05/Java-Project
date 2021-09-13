package frequency;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {1,2,3,4,5,6,6,8,8,10};
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}	
			}
			System.out.println(array[i]+" : "+count);
			count=0;
		
		}


	}

}
