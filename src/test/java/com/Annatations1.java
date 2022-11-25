package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Annatations1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Database Connection");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Stop the Machine");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Open Browser and Url of the Application");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Close the Application and Browser");
	}

	@Test
	public void test_valid_login_hcl() {
		System.out.println("Login Valid");
	}
	@Ignore
	@Test
	public void test_invalid_login_hcl() {
		System.out.println("Login InValid");
	}

}
