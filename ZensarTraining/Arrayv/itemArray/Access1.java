package itemArray;

import item.Item;
import java.util.*;
public class Access1 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] i = new Item[1];
		/*i.setItem_name("Abcd");
		i.setItem_id("z54256");
		i.setItem_cost(120);
		i.setQuantity(1);*/
		
		/*System.out.println("Item Name : "+i.getItem_name());
		System.out.println("Item id : "+i.getItem_id());
		System.out.println("Item cost : "+i.getItem_cost());
		System.out.println("Item cost : "+i.getQuantity());
		Supplier sp=new Supplier("abhijit","fsthd78",5783748);
		i.setSupp(sp);
		i.calculateBill();
		
		Item.changeServiceTax(20.00f);*/
		
		//Supplier sp=new Supplier("abhijit","fsthd78",5783748);
		//i.setSupp(sp);
		//i.display();
		
		/*Item i1 = new Item();
		i1.setItem_name("abcd");
		i1.setItem_id("z54267");
		i1.setItem_cost(120);
		i1.setQuantity(2);
		
		System.out.println("Item Name : "+i1.getItem_name());
		System.out.println("Item id : "+i1.getItem_id());
		System.out.println("Item cost : "+i1.getItem_cost());
		System.out.println("Item cost : "+i1.getQuantity());
		
		
		i1.calculateBill();*/
		for(int j=0;j<i.length;j++)
		{
			//i[j].acceptItem1();
			
		}
		
		for(int j=0;j<i.length;j++)
		{
			i[j].display();
			
		}
	}

}
