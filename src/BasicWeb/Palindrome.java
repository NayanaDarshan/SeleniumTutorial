package BasicWeb;

public class Palindrome {

	public static void main(String[] args) {
		String str ="nayana";
		String rev ="";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev+ str.charAt(i);
		}
	    
		System.out.println("The reversed string is=====>"+ rev);
	
	
	    if(str.equals(rev)) {
	    	
	    	System.out.println("The string is palindrome");
	    }
	    	else {
	    		
	    		System.out.println("The string is not palindrome");
	    	
	    }
}
	
}
