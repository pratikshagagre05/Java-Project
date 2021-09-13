package emoployee;

public class Employee {
	int id,salary;
	String name;
	Department dept;
	Mydate mydate;
	public Employee()
	{
		id=101;
		salary=20000;
		dept=new Department();
		mydate=new Mydate();
	}
	public void show()
	{
		System.out.println("Employee name : "+id);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Department Id : "+dept.dept_id);
		System.out.println("Department Name : "+dept.dept_name);
		System.out.println("Start Day : "+mydate.day);
		System.out.println("Start Month : "+mydate.month);
		System.out.println("Start Year : "+mydate.year);
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.show();
	}
}
class Department

{
	int dept_id;
	String dept_name;
	public Department()
	{
		dept_id=20;
		dept_name="Manager";
	}
}
class Mydate
{
	int day,year;
	String month;
	public Mydate()
	{
		day=01;
		month="September";
		year=2021;
	}
	
}
/*4. Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter\
*/