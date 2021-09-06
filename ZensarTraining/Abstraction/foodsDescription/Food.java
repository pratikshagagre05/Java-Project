package foodsDescription;

abstract public class Food {
	abstract void foodName();
	abstract void recipie();
	abstract void ingredients();
	

}

abstract class FoodRequirements extends Food
{
	abstract void foodName();
	abstract void ingredients();
	abstract void recipie();
	public void foodTypes() {
		System.out.println("Two types of food :\n1. Maharashtrian Food\n2. Punjabi Food");
	}
}
class MaharashtrianFood extends FoodRequirements
{
	void foodName() {
		System.out.println("Food Name : Misal");
	}
	void ingredients() {
		System.out.println("Maharashtrian Misal consist of........");
	}
	void recipie()
	{
		System.out.println("Misal Food Recipie as Follows..");
	}
}

class PunjabiFood extends FoodRequirements
{
	void foodName() {
		System.out.println("Food Name : Misal");
	}
	void ingredients() {
		System.out.println("Punjabi Misal consist of........");
	}
	void recipie()
	{
		System.out.println("Misal Food Recipie as Follows..");
	}
}



