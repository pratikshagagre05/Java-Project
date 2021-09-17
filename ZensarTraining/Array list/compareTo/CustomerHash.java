package compareTo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class CustomerHash// implements Comparable<CustomerHash>
{
	int cust_id;
	String cust_order;

	public CustomerHash() {

	}

	public CustomerHash(int cust_id, String cust_order) {
		// TODO Auto-generated constructor stub
		this.cust_id = cust_id;
		this.cust_order = cust_order;
	}

	@Override
	public String toString() {
		return "cust_id=" + cust_id + ", cust_order=" + cust_order;
	}

	@Override

	public int hashCode() {
		final int ans;
		ans = cust_id + cust_order.hashCode();
		return ans;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerHash other = (CustomerHash) obj;
		return cust_id == other.cust_id && Objects.equals(cust_order, other.cust_order);
	}

}

class CustomerHashing {
	public static void main(String[] args) {

		HashMap<CustomerHash, String> hashmap = new HashMap<>();

		CustomerHash c1 = new CustomerHash(101, "laptop");
		CustomerHash c2 = new CustomerHash(101, "laptop");
		CustomerHash c3 = new CustomerHash(102, "Pc");
		hashmap.put(c1, "14 th September");

		hashmap.put(c2, "16 th September");
		hashmap.put(c3, "17 th September");
		Set<CustomerHash> kset = hashmap.keySet();
		Iterator<CustomerHash> itr = kset.iterator();
		while (itr.hasNext()) {
			CustomerHash cm = itr.next();
			String Date = hashmap.get(cm);
			System.out.println(cm + " Delevered By " + Date);
		}

		TreeMap<CustomerHash, String> thash = new TreeMap<CustomerHash, String>(new CompareByCust_Id());

		thash.put(new CustomerHash(101, "laptop"), "14th Sept");
		thash.put(new CustomerHash(101, "laptop"), "15th Sept");
		thash.put(new CustomerHash(102, "Pc"), "16th Sept");
		thash.put(new CustomerHash(103, "Earphones"), "16th Sept");
		System.out.println("Sorted Tree map............");

		Set<CustomerHash> tset = thash.keySet();
		Iterator<CustomerHash> itr1 = tset.iterator();
		System.out.println("Tree Map Containts......");
		while (itr1.hasNext()) {
			CustomerHash cmt = itr1.next();
			String Date1 = thash.get(cmt);
			System.out.println(cmt + " Delevered By " + Date1);
		}

	}
}

class CompareByCust_Id implements Comparator<CustomerHash> {

	public int compare(CustomerHash o1, CustomerHash o2) {
		return o1.cust_id - o2.cust_id;
	}

}