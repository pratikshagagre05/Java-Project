package usedOfConstructor;

public class ParentClass {
	public String pName,pSirName;
	int page;
	public ParentClass(String pName, String pSirName, int page) {
		this.pName = pName;
		this.pSirName = pSirName;
		this.page = page;
	}
}
class ChildClass extends ParentClass
{
	public String s_Name,s_SirName;
	int s_age;
	public ChildClass(String s_Name, String s_SirName, int s_age) 
	{
		super("Dilip","Pansare",45);
		this.s_Name = s_Name;
		this.s_SirName = s_SirName;
		this.s_age = s_age;
	}
	public void show()
	{
		System.out.println("Child Name : "+s_Name);
		System.out.println("Child Sir_Name : "+s_SirName);
		System.out.println("Child Age : "+s_age);
		
		System.out.println("Parent Name : "+super.pName);
		System.out.println("Parent Sir_Name : "+super.pName);
		System.out.println("Parent Age : "+super.page);
		
	}
	public static void main(String[] args) {
		ChildClass c=new ChildClass("Pratik", "Pansare", 15);
		c.show();
	}
	
}
/*Show use of parameterized constructor of parent class (Child class invokes 
parent’s parameterized constructor) using super*/