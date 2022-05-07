package TestNGTest;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.ConstructorOrMethod;
import org.testng.xml.XmlTest;

public class TestsuiteTesting implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// This is applied on <Test> tag to print all method name

		System.out.println("The test suite name===>" + arg0.getName());

		ITestNGMethod Method[] = arg0.getAllTestMethods();

		for (ITestNGMethod method1 : Method) {

			System.out.println("The method name inside test suite ===>" + method1);
		}

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test Method Failure===>" + arg0.getName());

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test Method starting===>" + arg0.getName());

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("Test Method success===>" + arg0.getName());

	}

}