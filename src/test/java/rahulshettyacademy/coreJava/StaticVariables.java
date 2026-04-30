package rahulshettyacademy.coreJava;

public class StaticVariables {

	String name; // instance Variables 
	String address;
	static String city = "Singapore"; // any variable with static means its class variable
	static int i;
	

	public StaticVariables(String name, String address) {

		this.name = name;
		this.address = address;
		

	}

	public void getAddress() {
		
		i++;
		System.out.println(i + "  " + name + "  " + address + "  " + city);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {

		StaticVariables sv = new StaticVariables("Ramya", "Kthatib");
		sv.getAddress();
		StaticVariables sv1 = new StaticVariables("Vijaya", "Tampines");
		//sv.getAddress();
		sv1.getAddress();

		StaticVariables.getCity();
	
		
	}
	

}
