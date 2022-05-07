package TestNGTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGInvokeTesting.class)
public class InvokeTesting {
	
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("The code is from before class");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("The code is from After class");
	}
	
	@Test
	public void Testmethod1() {
		System.out.println("The code is from Test Method1");
	}
	
	@Test
	public void Testmethod2() {
		System.out.println("The code is from Test Method2");
	}
}
