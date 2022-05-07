package BasicWeb;

public class ShallowCopy {
	
	private String i;
	
	private String j;

	public static void main(String[] args) {
		
		ShallowCopy obj = new ShallowCopy();
		
		ShallowCopy obj2= obj;
		
		obj.i= "Green";
		obj.j = "Red";
		
		obj2.i= "Purple";
		
		System.out.println(obj.i +" "+obj.j);
	}

}
