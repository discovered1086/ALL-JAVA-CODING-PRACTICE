package com.kingshuk.corejava.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kingshuk.corejava.basic.intterview.TestStringHarness;

public class TestStringsClass {
	
	private TestStringHarness testClass;

	@Before
	public void setUp() throws Exception {
		testClass = new TestStringHarness();
	}

	@Test
	public void testSame() {
		assertEquals(true, testClass.select("Ankit", "Ankiitt"));
	}
	
	@Test
	public void testDifferent() {
		assertEquals(true, testClass.select("Ankit", "Ankttiii"));
	}

}
