package TestNGTest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGResult {

	@BeforeMethod
	public void beforemethod() {

		System.out.println("Before method name");
	}

	@Test
	public void Test1() {
		System.out.println("Message for Test1 Method");
		Assert.assertTrue(false);

	}

	@Test
	public void Test2() {
		System.out.println("The message from Test2 Method");
		Assert.assertTrue(true);
	}
@org.testng.annotations.AfterMethod
	public void AfterMethod(ITestResult result) {
		
		if(result.getStatus()== result.SUCCESS){
			
			System.out.println("SUCCESS======> " +result.getName());
		}
		
		if(result.getStatus()==result.FAILURE) {
			
			System.out.println("FAILURE=====>"  +result.getMethod().getMethodName());
		}
	 		
  }
}
