package BasicWeb;

public class vowelsTest {

	public static void main(String[] args) {
		String str = "smira";

		int len = str.length();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				System.out.println("The vowel is present==>" + str.indexOf(c) + " character is===>" + str.charAt(i));

			} 
			
			else if( c!=' '){
				System.out.println("The consantants are====> " +str.indexOf(c)+ " character is===>" +str.charAt(i));
			}

		}
	}

}
 