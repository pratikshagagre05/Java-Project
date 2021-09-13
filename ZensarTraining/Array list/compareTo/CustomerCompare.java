package compareTo;
import java.util.ArrayList;
import java.util.Collections;
public class CustomerCompare {
	public static void main(String[] args) 
	{
		ArrayList<Customer> clist=new ArrayList<>();
		clist.add(new Customer(107,"Ramesh",35));
		clist.add(new Customer(114,"Umesh",30));
		clist.add(new Customer(103,"Prathamesh",32));
		clist.add(new Customer(109,"Namesh",38));
		clist.add(new Customer(110,"Aamesh",30));
		System.out.println(clist);
		Collections.sort(clist);
		System.out.println(clist);
		
	}

}
