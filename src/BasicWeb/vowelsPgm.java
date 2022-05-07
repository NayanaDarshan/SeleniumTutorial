package BasicWeb;

public class vowelsPgm {

	public static void main(String args[]) {

		String str = "Nayana";

		int length = str.length();
		
		char c;
		int vcount = 0;
		int constcount = 0;
		int totalvcount;
		
		int totalconstcount;
		
		
		for (int i = 0; i < str.length(); i++) {
			

			c = str.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				
               
				vcount = vcount+1;

				System.out.println("vowels count:====>" + vcount);
			
			}

			
			else {

				constcount = constcount + 1;

				System.out.println("consonants count===>" + constcount);
				
			}

			
		}

	}

}
