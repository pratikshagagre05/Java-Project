package item;

import itemArray.Item1;
import itemArray.Supplier1;

public class Item {

	private String item_name;
	private String item_id;
	private float item_cost;
	private int quantity;
	static float service_tax = 18.5f;
	Supplier1 supp ;
	public void setSupp(Supplier1 s)
	{
		supp=s;
	}
	public Supplier1 getSupp()
	{
		return supp;
	}
	public static void changeServiceTax (float t)
	{
		service_tax=t;
	}
	public void setItem_name(String x)
	{
		item_name=x;
	}
	public String getItem_name()
	{
		return item_name;
	}
	public void setItem_id(String y)
	{
		item_id=y;
	}
	public String getItem_id()
	{
		return item_id ;
	}
	public void setItem_cost(float z)
	{
		item_cost=z;
	}
	public float getItem_cost()
	{
		return item_cost;
	}
	
	public void setQuantity(int q)
	{
		quantity=q;
	}
	public String getQuantity()
	{
		return item_name;
	}
	
	void calculateBill()
	{
		float result=quantity*item_cost;
		float bill=(service_tax/100)*result+result;
		System.out.println("Bill : "+ bill);
		
	}
	
	public void display()
	{
		System.out.println("Item Name : "+getItem_name());
		System.out.println("Item id : "+getItem_id());
		System.out.println("Item cost : "+getItem_cost());
		System.out.println("Item Quantity : "+getQuantity());
		Supplier1 sp=new Supplier1("abhs","fsthd78",5783748);
		setSupp(sp);
		calculateBill();
		sp.show();
		
		Item.changeServiceTax(20.00f);
	}

}
