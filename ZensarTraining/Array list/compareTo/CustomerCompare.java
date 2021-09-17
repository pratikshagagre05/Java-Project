package compareTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class CustomerCompare {
	public void display(ArrayList<Customer>l)
	{
		System.out.println("Usin Iterator .");
		Iterator<Customer> itr=l.iterator();
		while(itr.hasNext())
		{
			Customer c=itr.next();
			System.out.println(c);
		}
	}
	public static void main(String[] args) 
	{
		CustomerCompare c=new CustomerCompare();
		ArrayList<Customer> clist=new ArrayList<>();
		clist.add(new Customer(107,"Ramesh",35));
		clist.add(new Customer(114,"Umesh",30));
		clist.add(new Customer(103,"Prathamesh",32));
		clist.add(new Customer(109,"Namesh",38));
		clist.add(new Customer(110,"Aamesh",30));
		System.out.println(clist);
		Collections.sort(clist);
		System.out.println(clist);
		System.out.println("Sort By Id:");
		Collections.sort(clist, new CompareById() );
		c.display(clist);
		System.out.println("Sort By Age:");
		Collections.sort(clist, new CompareByAge() );
		c.display(clist);
		System.out.println("Sort By Nme:");
		Collections.sort(clist, new CompareByName() );
		c.display(clist);
		
	}

}
class CompareById implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.cust_id-o2.cust_id;
	}
	
}
class CompareByAge implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.cust_age-o2.cust_age;
	}
	
}
class CompareByName implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.cust_name.compareTo(o2.cust_name);
	}
	
}