package singleInheritance;

public class Evaluation{
	
	/*public void finlResult()
	{
		float result= 
	}*/

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineExam o = new OnlineExam("abcd@gmail.com","abcd@123") ;
		o.examTime(10,1);
		o.overallDisplay();
		o.total(600);
		o.result(450);
		
		
		

	}

}
