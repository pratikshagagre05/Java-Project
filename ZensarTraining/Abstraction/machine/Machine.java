package machine;

abstract public class Machine {
	public void rotate()
	{
		System.out.println("Machine class Rotate Method");
		
	}
	abstract public void crush();

}
class Juicer extends Machine
{
	public void crush()
	{
		System.out.println("Abstract Crush Method");
	}
	public void filter()
	{
		System.out.println("Juicer Class Filter Method");
	}
	
}


/*Create an abstract class Machine with an implemented / concrete method 
rotate and an abstract method crush. Create a class Juicer which extends this 
abstract class Machine and implements method crush. Now, add another 
method filter in the class Juicer. In main method, 
a. Create an object of type Juicer and calls its crush, rotate and filter 
methods. 
b. Create an object of type Juicer with reference variable of Machine 
(Machine m = new Juicer). Check the methods available to m.
2. Above we created an abstract class Machine with an abstract method crus*/





