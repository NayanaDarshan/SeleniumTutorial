package BasicWeb;

public class C1 {
	
	public C1(){
		System.out.println("The default constructor of C1");
	}
	
	public C1(int x) {
		this(10,20);
		System.out.println("The value of X is ===>" +x);
	}
	
	public C1( int x, int y) {
		
		System.out.println("The value is X and Y is===>" +x + " "+y);
	}

	public static void main(String[] args) {
		C1 objc = new C1(30);

	}

}
