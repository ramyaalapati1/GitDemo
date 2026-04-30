package rahulshettyacademy.coreJava;

public class Loops {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k+"\t ");
				k++;
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int p = 1;
		for (int i=4; i>=1 ; i--)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(p+"\t ");
				p++;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int q=1;
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print(q+"\t ");
				q++;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+"\t ");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		int a=3;
		int b=1;
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print(a*b+"\t ");
				b++;
				
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

}
