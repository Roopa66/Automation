package TestNg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator cltr = new Calculator();

	@Test(dataProvider ="dpAdd")
	public void add1Test(int exp, int a, int b) {
		
		Assert.assertEquals(exp, cltr.add1(a, b));

	}

	@Test
	public void sub1Test() {
		System.out.println("Thread value" +Thread.currentThread().getId());
		Assert.assertEquals(2, cltr.sub1(6, 4));
	}
	
	@DataProvider(name = "dpAdd")
	public Object [][] getData() {
		Object[][] t1 = new Object[][] {
			
			{10,5,5},
			{12,5,7},
			{60,30,30},
			{22,11,11},
			{3,34,5},
			{23,20,4}
			
		};
			return t1;
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
