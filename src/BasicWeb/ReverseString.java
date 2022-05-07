package BasicWeb;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String str = "Nayana";
		int len= str.length();
		String rev= "";
		
		for (int i=len-1; i>=0; i--) {
			rev= rev+ str.charAt(i);
	
	}
		System.out.println("The reversed string is =====> "+rev);
	
	}
	
}

