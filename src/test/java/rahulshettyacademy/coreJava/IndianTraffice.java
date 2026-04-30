package rahulshettyacademy.coreJava;

public class IndianTraffice implements CentralTraffic{

	public static void main(String[] args) {
		
		CentralTraffic it = new IndianTraffice();
		it.flashYello();
		CentralTraffic.greenGo();
		it.redStop();


	}

	@Override
	public void flashYello() {
		System.out.println("Prepare to stop");
		
	}
	
	public void redStop()
	{
		System.out.println("Custom :  stop....");
	}
	
	
	
	
}
