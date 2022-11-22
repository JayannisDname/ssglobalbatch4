package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.ssglobal.training.codes.Classification;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestClassification {
	private Classification classify;
	
	@BeforeEach
	public void setup() {
		classify = Classification.EXCELLENT;
	}
	
	@AfterEach
	public void teardown() {
		classify = null;
	}
	
	@Test
	public void testEvaluate() {
		Classification actualResult = Classification.evaluate(82);
		Classification expectedResult = Classification.PASS;
		assertSame(expectedResult, actualResult);
	}
	
	@ParameterizedTest
	@EnumSource(Classification.class)
	public void testGetWeights(Classification rating) {
		double expectedValue = 60;
		double actualValue = Classification.computeWeights(rating);
		assertFalse(actualValue >= expectedValue);
	}
}
