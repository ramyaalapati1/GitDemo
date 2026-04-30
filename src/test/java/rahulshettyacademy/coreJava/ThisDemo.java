package rahulshettyacademy.coreJava;

public class ThisDemo {
	
	int a = 3;
	
	public int getData()
	{
		int a = 5;
		System.out.println(a);
		System.out.println(this.a);
		int b= this.a+a;
		System.out.println(b);
		return b;
	}
	
	public void getDataa()
	{
		int a = getData();
		System.out.println(a+5);
	}
	
	
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.getData();
		td.getDataa();
			
		}
	}



