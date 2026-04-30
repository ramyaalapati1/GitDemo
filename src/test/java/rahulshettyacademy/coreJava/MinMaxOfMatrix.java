package rahulshettyacademy.coreJava;

public class MinMaxOfMatrix {

	public static void main(String[] args) {
		int a[][] = {{2,4,6,7},{3,0,7,9},{1,2,9,3}};
		int min=a[0][0];
		int mincolumn = 0;
	
//		System.out.println(a[2].length);
//		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				
				if(a[i][j]<min)
				{
					min = a[i][j];
					mincolumn = j;
				}
			}
		}
		System.out.println(min);
		//System.out.println(mincolumn);
		
		int max = a[0][mincolumn];
		
		for(int i=0; i<a.length; i++)
			
		{ 
			if (a[i][mincolumn]> max)
			{
				max = a[i][mincolumn];
			}
		}
		System.out.println(max);

	}

}
