package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.Profile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestProfile {
	
	private Profile profile;
	// Setup and initialization 
	// Fixtures
		
	@BeforeEach // use @BeforeEach not @Before
	public void setup(){ // always public void and no local param
		profile = new Profile();
	}
	
	@AfterEach // use @AfterEach not @After
	public void teardown() {
		profile = null; // garbage collect
	}
	
	// DO NOT IF ELSE AND TRY CATCH ON THE TEST METHODS
	
	// Test cases in the for methods
	@Test
	public void testShowProfile() { // always public and always void.
		//Profile profile = new Profile(); // THIS IS WRONG! Do not do this in the JUNIT!
		String expectedRec = "Juan 90";
		String actualRec = profile.showProfile();
		assertNotEquals(expectedRec, actualRec); // equivalent of if else
		System.out.println(actualRec);
	}
	
	@Test
	public void testIncreaseAge() {
		int expectedAge = 28;
		int actualAge = profile.increaseAge(10);
		assertEquals(expectedAge, actualAge); // in order
		System.out.println(actualAge);
	}
}
