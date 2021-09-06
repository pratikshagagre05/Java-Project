package methodOvaerloading;

public class MethodOverloading {
	
	public void Area(float s)
	{
		float area= (s*s);
		System.out.println("Area of Square= "+area);
	}
	public void Area(int s1,int s2)
	{
		int area=s1*s2;
		System.out.println("Area of Rectangle= "+area);
	}
	public void Area(int r)
	{
		float area=(float) (2*3.14*r);
		System.out.println("Area of Rectangle= "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.Area(6.00f );
		m.Area(5,9);
		m.Area(5);

				
	}

}
