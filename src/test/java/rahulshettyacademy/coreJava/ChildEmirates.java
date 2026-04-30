package rahulshettyacademy.coreJava;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.bodyColor();
		c.safetyGuidelines();
//        ParentAirCraft p = new ChildEmirates();
//		p.bodyColor();

	}

	@Override
	public void bodyColor() {
		System.err.println("blue color aircraft");
		
	}

}
