package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	@Test
	public void f() {
		System.out.println("test method runs");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before starts the test method execution");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After complete the test method execution");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before starts the class execution");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After complete the class execution");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before starts the test execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After complete the test execution");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before starts the suite file execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After complete the suite file execution");
	}

}
