package BasicWeb;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	
	public static void main( String [] args) {
		
		HashMap< Integer, String> hm = new HashMap< Integer, String>();
		hm.put(1, "Nayana");
		hm.put(2, "Smira");
		hm.put(3, "Bhumika");
		hm.put(4, "Kalpana");
		hm.put(5, "chawala");
		System.out.println("The hash code====>"+ hm.hashCode());
		System.out.println("The hashmap contents======>" +hm);
	
	   HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
	   
	      hm1=(HashMap)hm.clone();
	      
	      System.out.println("The hashmap contents======>" +hm1);  
	      System.out.println("The hash code====>"+ hm1.hashCode());
	      
	      //Printing all the valuse
	      
	      for (Entry<Integer, String> hm3 : hm.entrySet()) {
	    	  
	    	  System.out.println("The key is ====> "+ hm3.getKey());
	    	  System.out.println("The value is =====>" + hm3.getValue());
	    	  
	      }
	      
           for (Integer hm4 : hm.keySet()) {
	    	  
	    	  System.out.println("The value is =====>" + hm4);
	    	  
	      }
	             
	      
	
	}
	
}
