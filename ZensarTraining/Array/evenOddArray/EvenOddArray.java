package evenOddArray;

public class EvenOddArray {

	public static void main(String[] args) {
		
	        int n = 8;
	        int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };

	        int evenSize = 0;
	        int oddSize = 0;
	        for (int i = 0; i < n; i++) {
	            if (array[i] % 2 == 0)
	                evenSize++;
	            else
	                oddSize++;
	        }
	        int[] even = new int[evenSize];
	        int[] odd = new int[oddSize];
	        int j = 0, k = 0;
	        for (int i = 0; i < n; i++) {
	            if (array[i] % 2 == 0)
	                even[j++] = array[i];
	            else
	                odd[k++] = array[i];
	        }
	        System.out.print("Even Array contains: ");
	        for(int i=0;i<evenSize;i++)
	        {
	        	System.out.print(even[i]+" ");
	        }
	        System.out.print("\nEven Array contains: ");
	        for(int i=0;i<oddSize;i++)
	        {
	        	System.out.print(odd[i]+" ");
	        }
	   }

}
