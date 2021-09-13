package itemArray;

public class Supplier1 {

	String sname , sid;
	int smobile;
	
	public Supplier1()
	{
	
	}
	public Supplier1(String p,String q,int r)
	{
		sname=p;
		sid=q;
		smobile=r;
	}
	
	public void setSname(String x)
	{
		sname=x;
	}
	public String getSname()
	{
		return sname;
	}
	
	public void Sid(String x)
	{
		sid=x;
	}
	public String getSid()
	{
		return sid;
	}
	
	public void setSmobile(int x)
	{
		smobile=x;
	}
	public int getSmobile()
	{
		return smobile;
	}
	
	public void show()
	{
		System.out.println("S_name : "+ getSname()); 
		System.out.println("S_name : "+ getSid()); 
		System.out.println("S_name : "+ getSmobile()); 
		
	}

}
