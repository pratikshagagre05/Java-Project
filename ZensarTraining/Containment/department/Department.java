package department;

public class Department {
	int id;
	String name;
	public Department() {
		// TODO Auto-generated constructor stub
		id=101;
		name="Information Technology";
	}
	public Department(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Student
{
	int rollNo;
	String name;
	Department depart;
	public Student()
	{
		rollNo=11;
		name="Nikita";
		depart=new Department();
	}
	public Student(int rollNo,String name,Department dr)
	{
		this.rollNo=rollNo;
		this.name=name;
		depart=dr;
		
	}
	public void setDepart(Department d)
	{
		depart=d;
	}
	public Department getDepart()
	{
		return depart;
	}
	public void show()
	{
		System.out.println("Department id : "+depart.id);
		System.out.println("Department Name : "+depart.name);
		System.out.println("Roll number : "+rollNo);
		System.out.println("Student Name : "+name);
		
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.show();
		Department depart=new Department(104,"Computer");
		Student stud=new Student(10,"Khushal", depart);
		stud.show();
		
		
	}
}
/*  WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method
*/