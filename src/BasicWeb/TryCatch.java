package BasicWeb;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch obj= new TryCatch();
	    obj=null;
		obj.getnumber();

	}

	public void getnumber() {
		System.out.println("Please print number....");
		
		try {
			int i= 10/0;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("End of execution");
		}
		
		try {
			
		}
		catch(Exception e) {
			System.out.println("Obj is null");
			e.printStackTrace();
		}
	}
}
