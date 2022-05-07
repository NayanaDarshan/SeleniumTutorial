package TestNGTest;

import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTestClass {

	@BeforeMethod(alwaysRun =true)

	public void beforetestmethod() {
		System.out.println(" Before method");

	}

	@Test( alwaysRun=true)
	
	@Parameters({"Employee_name", "browser"})
	public void sum(String Employee_name, String browser) {
		int a = 5;
		int b = 6;

		System.out.println("The sum is===" + (a + b));
	    System.out.println("The employee name ==> " +Employee_name);
	    System.out.println("The browser name =====>" +browser);
	}

	@Test( groups = {"smoke", "regression"})

	public void Test2() {
		System.out.println("The message is from second method");

	}

	@Test(groups = { "smoke", "regression"})
	@Parameters({"response"})

	public void Test3(String response) {
		
		String stringArray[]= response.split(",");
		System.out.println("The message is from third method");
		
		System.out.println("The response message is ====> "+response);
		System.out.println("The stringarray[0]================>" +stringArray[0]);
		System.out.println("The stringarray[0]================>" +stringArray[1]);

	}

	@Test(groups = {"smoke"})

	public void Test4() {
		System.out.println("The message is from fourth method");

	}

	@AfterMethod(alwaysRun= true)

	public void Aftertestmethod() {
		System.out.println(" After method");

	}
}
