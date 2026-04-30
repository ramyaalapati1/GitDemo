package rahulshettyacademy.coreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 5;
		a[2] = 9;
		a[3]= 6;
		a[4] = 8;
		for(int i=0; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		int b[]= {1,5,9,4,6,2,7};
		for(int i=0; i<b.length ; i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
