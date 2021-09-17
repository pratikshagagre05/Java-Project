package maxInRowsColumns;

public class MaxInRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array={{1,2,5},{2,3,4},{3,4,5}};
		System.out.println("Miximum In Rows: ");
		for(int i=0;i<3;i++)
		{
			int max=array[i][0];
			for(int j=1;j<3;j++)
			{
				if(max<array[i][j])
				{
					max=array[i][j];
				}
			}
			System.out.print(max+" ");
		}
		System.out.println("\nMaximum In Columns:");
		for(int i=0;i<3;i++)
		{
			int max=array[0][i];
			for(int j=1;j<3;j++)
			{
				if(max<array[i][j])
				{
					max=array[i][j];
				}
			}
			System.out.print(max+" ");
		}
	}

}
