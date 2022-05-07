package BasicWeb;

import java.util.HashMap;

public class countoccurences {

	public static void main(String[] args) {

		String name = "5656575777576688ssbsbsbsbsbsbsbsjjjjjjjjjjjjjjvdvdvdvdvdvdvdvdvdvdv";
		
		int len= name.length();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for ( int i = len-1; i>=0; i--) {
			
			if(hmap.containsKey(name.charAt(i))){
				
			int count=	hmap.get(name.charAt(i));
			
			hmap.put(name.charAt(i), ++count);
				
			}
			
			else {
				hmap.put(name.charAt(i), 1);
			}
		}
		System.out.println(hmap);

	}

}
