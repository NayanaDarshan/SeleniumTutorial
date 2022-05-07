package TestNGTest;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestNGInvokeTesting implements IInvokedMethodListener{

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	System.out.println("AfterInvocation class name====>" +arg1.getClass().getName()+ "The method name is ====>" +arg0.getTestMethod().getMethodName());
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
     System.out.println("BeforeInvocation class name====>" +arg1.getClass().getName()+ "The method name is ====>" +arg0.getTestMethod().getMethodName());
		
	}
		
	}


