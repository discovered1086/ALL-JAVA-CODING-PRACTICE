package com.kingshuk.corejava.basic;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PairOfNumbersTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(2, Result.countPairs(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4), 2));
	}

	@Test
	public void test2() throws IOException {
		List<Integer> numbers = new ArrayList<>();

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("src/test/resources/input.txt"))), 100);

		String s = null;

		while ((s = bufferedReader.readLine()) != null) {
			numbers.add(Integer.parseInt(s));
		}

		assertEquals(784, Result.countPairs(numbers, 4414));

		bufferedReader.close();

	}

}
