package homeWork;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hr53sd76df";
		int count=0,sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
			{
				//if(Character.isDigit(str.charAt(i)))
				count++;
				char v=str.charAt(i);
				int value=Character.getNumericValue(v);
				sum=sum+value;
				
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
