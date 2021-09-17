package employeeArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Employee// implements Comparable<Employee>
{
	public int id, sal;
	String name;

	public Employee(int id, int sal, String name) {
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	public String toString() {
		return "Employee Id: " + id + " Employee Name: " + name + " Salary: " + sal;
	}

	/*
	 * public int compareTo(Employee o) { // TODO Auto-generated method stub int
	 * idResult = this.id - o.id; int salResult = this.sal - o.sal; int result =
	 * salResult == 0 ? idResult : salResult; return result; }
	 */

}

class CompareById implements Comparator<Employee>
{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
}

class EmployeeArrayList {
	public static void main(String[] args) {
		Employee e = new Employee(101, 60000, "Pratik");
		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(e);
		elist.add(new Employee(105, 45000, "Ram"));
		elist.add(new Employee(112, 50000, "Kamal"));
		elist.add(new Employee(100, 65000, "Naman"));
		elist.add(new Employee(99, 50000, "Shital"));
		Collections.sort(elist,new CompareById());
		
		ListIterator<Employee> itr = elist.listIterator();
		while (itr.hasNext()) {
			Employee temp = itr.next();
			System.out.println(temp);
		}

	}
}
/*
 * WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout
 * and see both variable memory space is printed. This is because toString is
 * not overriden but if you would have done this for Integer then beautiful
 * output would have been printed.
 */