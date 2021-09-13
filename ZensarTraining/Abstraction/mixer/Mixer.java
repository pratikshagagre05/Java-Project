package mixer;

import machine.Machine;

public class Mixer extends Machine 
{
	public void crush()
	{
		System.out.println("Mixer class crush method.");
	}
	public void blend()
	{
		System.out.println("Mixer class Blend Machine ");
	}
	public static void main(String[] args)
	{
		Mixer m=new Mixer();
		m.crush();
		m.blend();
		m.rotate();
	}
}

/*Above we created an abstract class Machine with an abstract method crush
and a concrete / implemented method rotate. Now create another abstract 
class Mixer which extends the abstract class Machine, has method crush 
implemented and has an additional concrete method blend. In main create an 
object of class of Mixer. Call methods rotate, blend and crush*/