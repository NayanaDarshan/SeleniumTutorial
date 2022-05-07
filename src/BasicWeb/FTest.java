package BasicWeb;

public class FTest {
	
	public static void sum() {
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("The sum of numbers is " +c);
	}
	
	public void getString( Object obj) {
		System.out.println("The string data from Obj method");
		
	}

	public void getString(String data) {
		System.out.println("The string data from String method");
	}
	
	public void getString(StringBuffer stringdata) {
		System.out.println("The string data from string buffer");
	}
}
