package DynamicPolymorphism;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronic e;//is called as dynamic polymorphism.
		e= new Refrigerator();
		e.doSale();
		e=new Television();
		e.doSale();

	}

}
