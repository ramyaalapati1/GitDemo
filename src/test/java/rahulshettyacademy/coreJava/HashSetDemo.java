package rahulshettyacademy.coreJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Ramya");
		hs.add("Krishna");
		hs.add("Vaishnavi");
		hs.add("Ishitha");
		hs.add("Vijaya");
		hs.add("Asrith");
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		/*hs.add("Ramya");
		hs.add("pinky");
		System.out.println(hs);
		hs.remove("pinky");
		System.out.println(hs);
		*/
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		
	}

}
