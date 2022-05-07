package BasicWeb;

import java.util.HashMap;

public class vowelscount {

	public static void main(String[] args) {
		String name ="NAYANA";
		
		int len= name.length();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
         hmap.put('A', 0);
         hmap.put('E', 0);
         hmap.put('I', 0);
         hmap.put('O', 0);
         hmap.put('U', 0);
         
         for(int i=0; i<len; i++) {
        	 
        	 if(hmap.containsKey(name.charAt(i))){
        		 int count =hmap.get(name.charAt(i));
        		 
        		 hmap.put(name.charAt(i), ++count);
        	 }
        	 
         }
System.out.println(hmap);
	}

}
