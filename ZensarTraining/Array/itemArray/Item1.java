package itemArray;
import java.util.*;
import item.Item;
import item.Supplier;

 

public class Item1 {
	
	Scanner sc=new Scanner(System.in);
	public String item_name;
	public String item_id;
	public float item_cost;
	public int quantity;
	static float service_tax = 18.5f;
	Supplier supp ;
	
	public void acceptItem1()
	{
		 item_name=sc.next();
		 item_id=sc.next();
		 item_cost=sc.nextFloat();
		 quantity=sc.nextInt();
	}
	{
		
	}
	
	public void setSupp(Supplier s)
	{
		supp=s;
	}
	public Supplier getSupp()
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
		/*System.out.println("Item Name : "+getItem_name());
		System.out.println("Item id : "+getItem_id());
		System.out.println("Item cost : "+getItem_cost());
		System.out.println("Item Quantity : "+getQuantity());
		Supplier sp=new Supplier("abhs","fsthd78",5783748);
		setSupp(sp);
		calculateBill();
		sp.show();
		
		Item1.changeServiceTax(20.00f);*/
		System.out.println("Item id : "+item_name);
		System.out.println("Item id : "+item_id);
		System.out.println("Item cost : "+item_cost);
		System.out.println("Item Quantity : "+quantity);
		
	}

	

}
