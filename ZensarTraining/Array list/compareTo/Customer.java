package compareTo;
import java.util.ArrayList;
import java.util.Comparator; 

public class Customer implements Comparable<Customer>
{
	int cust_id,cust_age;
	String cust_name;
	public Customer(int cust_id, String cust_name, int cust_age) {
		this.cust_id = cust_id;
		this.cust_age = cust_age;
		this.cust_name = cust_name;
	}

	public int compareTo(Customer c)
	{
		if(this.cust_age<c.cust_age)
			return -1;
		else if(this.cust_age>c.cust_age)
			return 1;
		else
			return this.cust_id-cust_id;
	}
	public String toString()
	{
		String str="Customer Id : "+cust_id+" Customer Name : "+cust_name+" Customer Age : "+cust_age+"\n";
		return str;
	}
	
}
