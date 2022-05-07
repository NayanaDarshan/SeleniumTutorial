package BasicWeb;

public class TestBase {
	
	public static void main(String [] args) {
		
		TestBase obj = new TestBase();
		try {
			
			
			obj.getName();
			
		}
		
		catch( Exception e) {
			e.printStackTrace();
		}
	}

	public void getName() {
		System.out.println("The name display");
		getnumber();
	}
	
	public void getnumber() {
		System.out.println("Display the number");
		numCal();
	}
	
	public void numCal() {
		 int i =9/0;
		 System.out.println("Exception error");
	}
}
