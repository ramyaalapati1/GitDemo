package rahulshettyacademy.coreJava;

public class ExceptionDemo {

	int a = 4;
	int b = 7;
	int c = 0;

	public void divideNumbers() {
		try {
			int k = b / c;
			int[] a = new int[7];
			System.out.println("Result: " + k);

		} 
		catch (ArithmeticException e)
		{
			System.out.println("he he eh " + e);
		}
		catch (Exception e) {
			System.out.println("Exception caught: " + e);

		}
		finally {
			System.out.println("I am finally block");
		}
		
	}

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		ed.divideNumbers();

	}

}
