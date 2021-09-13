package Employee;
import java.util.Scanner;
public class Employee 
{
	int id;
	String name;
	int salary;
	Scanner sc=new Scanner(System.in);
	public Employee()
	{
		id=101;
		name="Nikita";
		salary=50000;
	}
	public Employee(int id, String name, int salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void accept()
	{
		System.out.println("Enter Name : ");
		id=sc.nextInt();
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Name : ");
		salary=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Employee Name : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Name : "+salary);
	}
	public static void main(String[] args)
	{
		//Employee e=new Employee(101," Pratiksha", 50000);
		Employee [] e=new Employee[5];
		e[0]=new Employee(101,"pratiksh",50000);
		e[1]=new Employee(102,"pratik",40000);
		e[2]=new Employee(103,"pratibha",30000);
		e[3]=new Employee(104,"pratima",40000);
		e[4]=new Employee(105,"pranali",20000);
		/*for(int i=0;i<e.length;i++)
		{
			e[i].accept();
			System.out.println("--------------------------------------------------");
		}*/
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
			System.out.println("--------------------------------------------------");
		}
	}

}
/*WAP to create an array of Employee[] array .
(Create Employee class which has 3 attributes id, name, salary and add
employee objects to your array*/