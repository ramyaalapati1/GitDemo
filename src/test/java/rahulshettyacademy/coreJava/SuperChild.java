package rahulshettyacademy.coreJava;

public class SuperChild extends SuperParent {


	String name = "Krishna";
	
	public SuperChild()
	{
		super();
		System.out.println("Child Class COnstructor");
	}

	public void getStringData()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
	public void getParentData()
	{
		super.getParentData();
		System.out.println("I am child class method");
	}
	
	public static void main(String[] args) {
		SuperChild sc = new SuperChild();
		sc.getStringData();
		sc.getParentData();
		
	}

}
