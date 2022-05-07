package BasicWeb;

public class consantantscount {

	public static void main(String[] args) {
		String name="Nayanasmirssa";
		int length= name.length();
		
		int count=0;
		
		for(int i=0; i<length; i++) {
			
			char ch= name.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				System.out.println(" ");
				
			}
			
			else {
				if(ch != ' ') {
					count++;
				}
			}
			
		
		}

		System.out.println("The number of consonants is====>" +count);
		
	System.out.println(name.indexOf('s', (name.indexOf('s'))+1));
	}

	
}
