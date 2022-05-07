package BasicWeb;

public class C11 {

	String name;
	int rollno;
	String courseName;
	double fees;
	
	
	public C11( String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public C11( String name, int rollno, String courseName, double fees) {
		this(name,rollno);
		this.courseName= courseName;
		this.fees= fees;
		
	}
	public static void main(String[] args) {
		C11 obj = new C11("Nayana", 3456, "Computer Science", 78900.67);
		C11 obj1 = new C11("Smira", 7879, "Information Science", 98766.67);
		System.out.println(obj.name+ " "+obj.rollno+ " "+obj.courseName+" "+obj.fees);
		System.out.println(obj1.name+ " "+obj1.rollno+ " "+obj1.courseName+" "+obj1.fees);
		
	
	}

}
