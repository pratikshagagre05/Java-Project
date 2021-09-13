package society;

class Society {
	String sName;
	String sRegNo;
	Society()
	{
		this.sName="Goodwill Terrace 1";
		this.sRegNo="15H";
	}
	void showSocietyDetails()
	{
		System.out.println("Society Name: "+sName);
		System.out.println("Society Registration Number : "+sRegNo);
	}
	class Flat{
		int flatNo;
		String flatArea;
		String flatOwnerName;
		Flat()
		{
			this.flatNo=05;
			this.flatArea="Vishrantwadi";
			this.flatOwnerName="Mrs.Pansare";
		}
		void showFlatDetails()
		{
			System.out.println("Flat Id: "+flatNo);
			System.out.println("Flat Area: "+flatArea);
			System.out.println("Flat Owner Name: "+flatOwnerName);
			showSocietyDetails();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Society s=new Society();
		Society.Flat f=s.new Flat();
		f.showFlatDetails();

	}

}
