package rahulshettyacademy.coreJava;

public interface CentralTraffic {
	
	public static void greenGo()
	{
		System.out.println("you can go");
	}
	public default void redStop()
	{
		System.out.println("you must stop");
	}
	public void flashYello();

}
