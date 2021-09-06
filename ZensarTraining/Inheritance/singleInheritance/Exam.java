package singleInheritance;

public class Exam {
	protected String examName;
	String university;
	
	public Exam()
	{
		examName="Final";
		university="SPPU";
	}
	public Exam(String s1,String s2)
	{
		examName=s1;
		university=s2;
	}
	public void setExamName(String en)
	{
		examName = en;
	}
	public void setUniversity(String un)
	{
		university = un;
	}
	
	
	public String getExamName()
	{
		return examName;
	}
	public String getUniversity()
	{
		return university;
	}
	
	protected void examDetails()
	{
		System.out.println(examName);
		System.out.println(university);
	}
	
	void show()
	{
		System.out.println("Exam name : "+ getExamName()); 
		System.out.println("University : "+ getUniversity()); 
		 
		
	}

}
