package machine;

public class MainImplimentation {
	public static void main(String[] args) {
		System.out.println("Hii");
		Juicer j = new Juicer();
		j.crush();
		j.filter();
		j.rotate();
		Machine m = new Juicer();
		m.crush();
		m.rotate();
	}

}
