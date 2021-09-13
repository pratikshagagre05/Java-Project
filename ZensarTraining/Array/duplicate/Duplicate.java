package duplicate;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {1,2,3,4,5,6,6,8,8,10};

		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			 {
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
			 }
		}
	}	

}


