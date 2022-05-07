package BasicWeb;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Nayana");
		al.add("Smira");
		al.add("Mandya");
		al.add("Bhumika");
		
		int size = al.size();
		
		for ( int i =0; i<size; i++) {
			
			System.out.println("The elements of array list=====>" +al.get(i));
		}
	
		
		Employee e1= new Employee("Nayana", 32, "Testing");
		Employee e2= new Employee("Smira", 4, "IT");
		Employee e3= new Employee("Bhumika", 25, "Admin");
		
		
		ArrayList<Employee>ae = new ArrayList<Employee>();
		ae.add(e1);
		ae.add(e2);
		ae.add(e3);
		
		Iterator <Employee> IT = ae.iterator();
		
		while(IT.hasNext()){
			
			Employee emp =IT.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		for(String arn :al) {
			System.out.println("The values in Array are======> "+arn);
		}
	
	
	
	}

	
}