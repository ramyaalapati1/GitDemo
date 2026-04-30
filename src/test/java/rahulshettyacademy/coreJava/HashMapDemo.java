package rahulshettyacademy.coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(0, "Hello");
		m.put(1, "Good Bye");
		m.put(2, "Ramya");
		m.put(3, "Krishna");
		
		
		System.out.println(m);
		
		Set<Map.Entry<Integer,String>> s = m.entrySet();
		Iterator<Entry<Integer, String>> i = s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, String> ma = i.next();
			System.out.println(ma.getKey());
			System.out.println(ma.getValue());
			
		}
		
		
		

	}

}
