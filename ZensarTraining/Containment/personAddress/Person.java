package personAddress;

public class Person {
	String name;
	String gender;
	int age;
	Address address;
	public Person()
	{
		name="Khushal";
		gender="Male";
		age=18;
		address=new Address();
	}
	public Person(String name,String gender,int age,Address addr)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		address=addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void show()
	{
		System.out.println("Person Name : "+getName());
		System.out.println("Gender : "+getGender());
		System.out.println("Age : "+getAge());
		System.out.println("City : "+address.getCity());
		System.out.println("State : "+address.getState());
		System.out.println("Country : "+address.getCountry());
	}
	public void showThrowConstructor()
	{
		System.out.println("Person Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("City : "+address.city);
		System.out.println("State : "+address.state);
		System.out.println("Country : "+address.country);
	}
		

	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.showThrowConstructor();
		System.out.println("------------------------------------------------------------");
		Address ad=new Address("Pune", "Maharashtra", "India");
		Person p=new Person("Khushi", "Female", 18, ad);
		p.showThrowConstructor();
		System.out.println("-------------------------------------------------------------");
		ad.setCity("Washignton");
		ad.setState("South America");
		ad.setCountry("America");
		p.setName("Nikita");
		p.setGender("Female");
		p.setAge(20);
		p.setAddress(ad);
		p.show();
		
	}
	
	
}
class Address
{
	String city;
	String state,country;
	public Address()
	{
		city="Sangamner";
		state="maharashtra";
		country="India";
	}
	public Address(String city, String state, String country) 
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
/*Create class Person which has attributes (name, gender, age, Address).
Address is class which has attributes (city, state, country). Display Persons
data
Note. Containment using constructor and getter/setter

*/