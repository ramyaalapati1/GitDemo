package rahulshettyacademy.coreJava;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * List<String> a = new ArrayList<String>(); a.add(10)
		 */;
		 
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 a.add(10);
		 a.add(20);
		 System.out.println(a);
		 a.add(0, 30);
		 System.err.println(a.get(0));
			/*
			 * a.remove(1); System.out.println(a);
			 */
		 System.out.println(a.contains(80));
		 System.out.println( a.indexOf(10));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.add(10);
		 System.out.println(a);
		 
		 ArrayList<String> b = new ArrayList<String>();
		 System.out.println("++++++++++++++++++++++++++++++");
		 b.add("apple");
		 b.add("banana");
		 b.add("cherry");
		 b.add("mango");
		 b.add("apple");
		 b.add("Lilly");
		 b.add("Sunflower");
		 System.out.println(b);
		 
		 if(b.contains("apple"))
		 	 b.remove(0);
			 
		 System.out.println(b);
		 boolean bool = b.contains("orange");
		 if(bool == true)
			 System.out.println("Orange is found");
		 else
			 System.out.println("Orange not found");
		 
		 System.out.println(b.size());
		 
		 
		 for(int i = 0; i<b.size(); i++)
		 {
			 System.out.println("Elenement in index "+ i + " is: " + b.get(i) );
		 }
			 
	
	
 
		 
		

	}

}
