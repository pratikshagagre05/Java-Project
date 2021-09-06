package singleInheritance;

public class OnlineExam extends Exam {
	String userid,pass;
	float marks;
	Exam ex;
	public void setEx(Exam e)
	{
		ex=e;
	}
	public Exam getEx()
	{
		return ex;
	}
	//public OnlineExam() {}
	public OnlineExam(String s1,String s2)
	{
		super("Mid Term Exam","Savitribai Phule Pune University");
		userid=s1;
		pass=s2;
		//outOfmarks=f1;
	}
	public String getUserid()
	{
		return userid;
		
	}
	public String getPass()
	{
		return pass;
	}
	public float getMarks()
	{
		return marks; 
	}
	
	

	void examTime(int startTime,int endTime)
	{
		System.out.println("Exam well Start at "+startTime+
				" AM and End  "+endTime+" pm");
		
	}
	void total(int marks)
	{
		System.out.println("Total marks : "+marks);
	}
	void result(int achieve_marks)
	{
		int result = (achieve_marks*100)/600;
		System.out.println("Obtained Marks : "+achieve_marks);
		System.out.println("Final Result : "+result);
	}
	
	void overallDisplay()
	{
		Exam e=new Exam();
		setEx(e);
		e.show();
		System.out.println("User Id : "+getUserid());
		System.out.println("Password : "+getPass());
		
	}


}
