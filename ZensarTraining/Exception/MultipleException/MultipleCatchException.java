package MultipleException;

public class MultipleCatchException {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			int a[]= {1,2,3,4};
			System.out.println(a[4]);
			
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception occured.");
			a.printStackTrace();
			System.out.println(a.getMessage());
			// TODO: handle exception
		}
		catch(ArithmeticException a1)
		{
			a1.printStackTrace();
			System.out.println(a1.getMessage());
		}
	}

}
