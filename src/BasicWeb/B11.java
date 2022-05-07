package BasicWeb;

import java.util.ArrayList;

public class B11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B11.launchBrowser("opera");
		
		B11 objb= new B11();
		
		ArrayList<String> stuDetails = new ArrayList<String>();
		
		stuDetails= objb.studentList("Third Class");
		
		System.out.println(stuDetails);
		
		for (String s :stuDetails) {
			System.out.println(s);
		}
			
		stuDetails.stream().forEach(System.out::println);
		
		System.out.println("**************************************");
		
		stuDetails.forEach(ele -> System.out.println(ele));
		
		}
	
	

	
	public static String launchBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.out.println("Launching the chrome browser.....");
			
		}
		else if( BrowserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Launching the firfox browser");
		}
		
		else if (BrowserName.equalsIgnoreCase("IE")) {
			System.out.println("Launching the IE browser");
		}
		else
		{
			System.out.println("The correct browser mathc is not found");
		}
		return BrowserName;
		
	}
	
	public ArrayList<String> studentList(String className) {
		
		ArrayList<String> studentName = new ArrayList<String>();
		if(className.equalsIgnoreCase("First Class")) {
			studentName.add("Smira");
			studentName.add("Nayana");
			studentName.add("Darshan");
			
		}
		
		else if (className.equalsIgnoreCase("Second class")) {
			studentName.add("Tom");
			studentName.add("dick");
			studentName.add("harry");
		}
		else {
			System.out.println("No match found");
		}
		
		return studentName;
	}
}
