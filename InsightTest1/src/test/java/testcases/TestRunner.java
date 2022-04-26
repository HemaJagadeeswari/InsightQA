package testcases;

import org.testng.TestNG;

public class TestRunner {

	static TestNG Testng;
	public static void main(String[] args) {
Testng=new TestNG();
Testng.setTestClasses(new Class[] {LoginPageTest.class, HomePageTest.class, DashboardPageTest.class});
Testng.run();
	}

}
