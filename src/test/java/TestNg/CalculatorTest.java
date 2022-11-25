package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator cltr = new Calculator();

	@Test
	public void add1Test() {
		Assert.assertEquals(10, cltr.add1(6, 4));

	}

	@Test
	public void sub1Test() {
		Assert.assertEquals(2, cltr.sub1(6, 4));
	}

	@Test
	public void all_Assertions_Test() {

//test data

		String actual = "Family";
		String Expected = "Family";
		int m = 0, n = 1, p = 0;

		// ASSERTIONS

		Assert.assertTrue(m < n);
		Assert.assertTrue(m < n, "pass");
		Assert.assertFalse(m > n);
		Assert.assertFalse(m > n, "Fail");

		Assert.assertEquals(actual, Expected);
		Assert.assertEquals(0, m = p);
	}

	@Test
	public void test2() {

		Assert.assertNotNull(10);
		System.out.println("Java Language");

		Assert.assertNull(null);
		System.out.println("C Language");

		Assert.assertNotSame("hi", "ramya");
		System.out.println("hi Ramya");

		Assert.assertSame("hi", "hi");
		System.out.println("Hi Roopa");
		
		Assert.assertNotEquals("Hello", "How are you");  
        System.out.println("Hello...This is javaTpoint");  

	}

}
