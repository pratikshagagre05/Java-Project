package student;

public class Student {
	protected int rollNo;
	private int age;
	public String admissionNo;
	String courseId;
	public Student()
	{
		rollNo=05;
		age=18;
		admissionNo="FGg5674832";
		courseId="M142";
		
	}
	public void show()
	{
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Age : "+age);
		System.out.println("Admission Number : "+admissionNo);
		System.out.println("Course Id : "+courseId);
	}
	public void doPublic()
	{
		 System.out.println("Public Method");
	}
	private void doPrivate()
	{
		 System.out.println("Private Method");
	}
	void doDefault()
	{
		 System.out.println("Default Method");
	}
	protected void doProtected()
	{
		 System.out.println("Protected Method");
	}

}
class StudentMain
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		System.out.println();
		s.doPublic();
		s.doDefault();
		s.doProtected();
		s.show();
	}
}
/*4.	Create a class Student with 4 variables called as rollNo, admissionNo, age, courseId
.Each of the variables should have one of the access modifier - public, protected, no-access-modifier
and private.Add 4 methods in the class – public, method doPublic, no access modifier method doDefault, 
protected method doProtected, private method doPrivate.
In main method outside the class but in same package – create object of type Student.
*/