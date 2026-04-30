package rahulshettyacademy.coreJava;

public class KishAssignment {

	public static void main(String[] args) {
		
			int a[][] = {{2,4,0},{3,2,7},{1,2,9}};
			
			
			
			int min = a[0][0];
			int minCol = 0;
			//identify which is min and minCol
			for(int i=0; i<a.length; i++) {
				for(int j=0;j<a[i].length;j++) {
					
					if(a[i][j] < min) {
						min = a[i][j];
						minCol = j;
					}
				}
			}
			System.out.println(minCol);
			int max = 0;
			for(int i=0;i<a.length;i++) {
				if(a[i][minCol]>max) {
					max=a[i][minCol];
				}
			}
			System.out.println(max);
	}

}
