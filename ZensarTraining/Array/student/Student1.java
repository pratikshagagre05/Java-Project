package student;

public class Student1 {
	int id;
	String name;
	String[] hobbies=new String[2];
	public Student1(int id, String name, String[] hobbies) 
	{	
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public void show()
	{
			System.out.println("\nStudent Id : "+id);
			System.out.println("Student Name : "+name);
			System.out.println("Student Hobbies : ");
			for(int i=0;i<hobbies.length;i++)
			{
				System.out.print(hobbies[i]+" , ");
			}
			
	}
	
	public static void main(String[] args)
	{
		//Student1 s=new Student1(1, null, args)
	}
	

}
/*Create a class Student with following attributes
(int id,String name,String[] hobbies).
Create 2 student object using constructor and getter/setter.
*/
