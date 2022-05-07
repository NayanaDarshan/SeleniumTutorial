package TestNGTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapIterate {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Nayana", 1);
		hmap.put("Smira", 2);
		hmap.put("Smaya", 3);
		
		Iterator it =hmap.entrySet().iterator();
		
		while(it.hasNext()) {
			
		Map.Entry<String, Integer> pairs =(Entry<String, Integer>) it.next();
		
		System.out.println(pairs.getKey());
		
		System.out.println(pairs.getValue());
		
		}

	}

}
