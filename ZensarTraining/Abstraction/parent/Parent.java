package parent;

abstract public class Parent
{
	public void cook() 
	{}
	public void wash()
	{
		System.out.println("Parent class washing Method.");
	}

}
class Child extends Parent
{
	public void cook()
	{
		System.out.println("Abstract Method Cook().");
	}
	public static void main(String[] args)
	{
		Child c=new Child();
		c.cook();
		c.wash();
	}
}
/*WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
which has only definition and one method wash() which also has 
implementation. Create class Child which extends Parent and add the missing 
method implementation. In main, use both the methods by creating instance 
of the concrete class.*/