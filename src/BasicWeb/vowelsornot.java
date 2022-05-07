package BasicWeb;

public class vowelsornot {

	public static void main(String[] args) {

		char ch ='n';
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The given character is vowel===>"+ch);
		break;
		default: 
				System.out.println("The given character is consonant===>"+ch);
		}
	}

}
