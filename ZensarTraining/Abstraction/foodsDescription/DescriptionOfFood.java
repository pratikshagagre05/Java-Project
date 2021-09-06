package foodsDescription;

public class DescriptionOfFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodRequirements f ;
		f=new MaharashtrianFood();
		f.foodTypes();
		f.foodName();
		f.ingredients();
		f.recipie();
		f=new PunjabiFood();
		f.foodName();
		f.ingredients();
		f.recipie();
	}
}