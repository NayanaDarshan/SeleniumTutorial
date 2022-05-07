package TestNGTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestsuiteTesting.class)

public class ListesnerTestclass {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("The code is executed from beforeclass");
		Reporter.log("REPORT===The message for before class", false);
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("The code is executde from afterclass");
	}

	@Test
	public void sumMethod1() {
		
		int a =10;
		int b =12;
		
		int sum = a+b;
		
		Assert.assertEquals(sum, 22);
	}

     @Test
     public void resultMethod2() {
    	 Assert.assertTrue(true);
     }


}
