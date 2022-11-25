package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTestAssertions {
	Calculator cltr= new Calculator();
	
	

	
	@Test
	public void testAdd1() {
		assertEquals(12,cltr.add1(3, 9));
	}

	@Test
	public void testSub1() {
		assertEquals(-1, cltr.sub1(3, 4));
	}

	@Test
	public void testBinary() {
//test data
		
		int u=12, k=10;

//ASSERTIONS
		
		assertTrue(u>k);
		assertFalse(u<k);
	}
	
	@Test
	public void testStrings() {
//test data
		
		String s1 = "mnb";
		String s2 = "mnv";
		String s3 = null;
		String s4 = "abc";
		String s5 = "abc";
		String[] expectedArray = {"roopa", "Jyothi", "jack"};
	    String[] resultArray =  {"roopa", "Jyothi", "jack"};
		
//ASSERTIONS
		
		assertSame(s4,s5);
		assertNotNull(s4);
		assertNull(s3);
		assertNotSame(s1,s2);
		assertArrayEquals(expectedArray,resultArray);
		
	}
}
