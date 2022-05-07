package BasicWeb;

public class B1 {

	public static void main(String[] args) {
		B1 objb= new B1();
		objb.start();
		//objb.stop();

	}

	
	public void start() {
	this.stop();
		System.out.println("The starting method is A");
	}
	
	public void stop() {
		System.out.println("The stopping methos is A");
	}
}
