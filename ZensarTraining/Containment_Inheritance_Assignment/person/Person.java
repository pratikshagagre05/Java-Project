package person;
import java.util.Scanner;

public class Person extends Vehicle 
{
	
	int id;
	String pname;
	Vehicle v;
	public void setV(Vehicle v)
	{
		this.v=v; 
	}
	public Vehicle getV ()
	{
		return v;
	}
	public void acceptData()
	{
		System.out.println("Enter Person Id : ");
		this.id=sc.nextInt();
		System.out.println("Enter Person  Name : ");
		this.pname=sc.next();
		Vehicle v=new Vehicle();
		setV(v);
		v.acceptData();
		
	}
	public void showAll()
	{
		System.out.println("Person Id : "+id);
		System.out.println("Person Name : "+pname);
		System.out.println("Vehicle Id : "+v.vid);
		System.out.println("Vehicle Name : "+v.vname);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.acceptData();
		p.showAll();
	}

}
class Vehicle
{
	Scanner sc=new Scanner(System.in);
	int vid;
	String vname;
	public void acceptData()
	{
		System.out.println("Enter Vehicle Id : ");
		this.vid=sc.nextInt();
		System.out.println("Enter Vehicle Name");
		this.vname=sc.next();
	}
		
}

/*3.	Write a java program to create 2 person objects .Take input or hardcode  for all  two person from console. Person class is as follows 
Person (int id, String name, Vehicle v )
Vehicle (int vid, String vname) 

 */
