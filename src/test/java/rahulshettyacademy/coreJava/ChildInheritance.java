package rahulshettyacademy.coreJava;

public class ChildInheritance extends ParentInheritance {

	public void engine() {
		System.out.println("Engine COde is implementd");
	}
	public void color()
	{
		System.out.println(color);
	}
	@Override
	public void breaks()
	{
		System.out.println("new breaks code is implemented");
	}
	public void data(int a) {
		System.out.println(a);
	}
	public void data(String a) {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		ChildInheritance ci = new ChildInheritance();
		ci.audioSystem();
		ci.breaks();
		ci.color();
		ci.engine();
		ci.data(3);
		ci.data("Ramya");

	}

}
