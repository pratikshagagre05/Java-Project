package sortingArray;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[i])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
