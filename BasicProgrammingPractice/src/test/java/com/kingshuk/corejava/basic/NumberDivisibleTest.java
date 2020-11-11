package com.kingshuk.corejava.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kingshuk.corejava.basic.intterview.TestHarness;

public class NumberDivisibleTest {
	private TestHarness testHarness;

	@Before
	public void setUp() throws Exception {
		testHarness = new TestHarness();
	}

	@Test
	public void testDivisibleBy3() {
		assertEquals("Three", testHarness.divisibleBy(9));
	}
	
	@Test
	public void testDivisibleBy5() {
		assertEquals("Five", testHarness.divisibleBy(10));
	}
	
	@Test
	public void testDivisibleBy3And5() {
		assertEquals("Both", testHarness.divisibleBy(15));
	}

}
