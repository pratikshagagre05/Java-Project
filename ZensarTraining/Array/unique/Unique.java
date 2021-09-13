package unique;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {1,5,3,4,5,6,6,8,8,4};
		System.out.println("Unique Elements : ");
		for(int i=0;i<array.length;i++)
		{
			int flag=0;
			for(int j=i+1;j<array.length;j++)
			 {
				if(array[i]==array[j])
				{
					flag=1;
					break;
				}
			 }
			if(flag==0)
			{
				System.out.print(array[i]+" ");
			}
		}
	}	
}
