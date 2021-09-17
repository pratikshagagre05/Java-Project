package commomElements;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 23, 55, 54, 9, 76, 66, 2, 91 };
		int b[]= { 24, 54, 55, 8, 91, 6, 3, 90 };
		for(int i:a)
		{
			for(int j : b)
			{
				if(i==j)
				{
					System.out.print(i+" ");
				}
			}
		}

	}

}
