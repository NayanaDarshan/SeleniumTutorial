package BasicWeb;

import java.util.HashMap;
import java.util.Map;

public class DataConversion {

	public static void main(String[] args) {

		String s = "1000test";
		String s1 = s.replace("test", "");
		System.out.println(s1);

		int i = Integer.parseInt(s1);
		System.out.println(i + 200);

		int j = 200;
		String m = String.valueOf(j);
		System.out.println(m + 20);
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Nayana");
		map1.put(2, "Smira");
		map1.put(3, "Dolo");
		map1.put(4, "Bolo");
		
		
		System.out.println(map1.get(1));
		
		
		for( Map.Entry<Integer, String> obj2 : map1.entrySet()) {
			System.out.println("Key====>" +obj2.getKey() + "and value is ===>" +obj2.getValue());
		}
		 
		for( Integer obj4 : map1.keySet()) {
			System.out.println("Key====>" +obj4);
		}	
			
			for (String obj3 : map1.values()) {
				System.out.println("The values are ===>" +obj3);
			}
		


	}

}
