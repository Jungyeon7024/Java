package com.kh.testSample;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class JunitMain {
	
	@Test
	public void testStringEqual() {
		String expected = "Hello, World!";
		String actual = "Hellow, World!";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStringInEqual() {
		String expected = "Hello, Java!";
		String actual = "Hello, World!";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testArraylEqual() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual); //배열 비교
	}
	@Test
	public void testArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual); //배열이 다르다는 것을 검증
	}

	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.3;
		assertEquals(expected, actual, 0.001);// 부동소수점 비교(오차범위지정)
	}
	
	
}