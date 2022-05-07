package BasicWeb;

public class ReverseS {

	public static void main(String[] args) {
		
		String name = "Nayana";
		
		 int len = name.length();
		 
		 String rev="";
		 
		 for( int i=len-1; i>0; i-- ) {
			 
			 rev = rev+name.charAt(i);
		 }
		 System.out.println("The reversed number is" +rev);

	}

}
