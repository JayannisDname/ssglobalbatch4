package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.SortedNum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSortedNum {
	private SortedNum sortNum;
	
	@BeforeEach
	public void setup() {
		sortNum = new SortedNum();
	}
	
	@AfterEach
	public void teardown() {
		sortNum = null;
	}
	
	@Test
	public void testSort() {
		int[] expectedArray = {1, 2, 3, 4, 6};
		int[] actualArray = sortNum.sort(new int[] {6, 4, 1, 2, 3});
		assertArrayEquals(expectedArray, actualArray);
	}
}
