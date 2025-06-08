package de.fh.aachen.isqm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifeCycleTest {

	@BeforeAll
	public void beforeAllTests() {
		System.out.println("@BeforeAll - Executed once before all tests");
	}

	@AfterAll
	public void afterAllTests() {
		System.out.println("@AfterAll - Executed once after all tests");
	}

	@BeforeEach
	public void beforeEachTest() {
		System.out.println("@BeforeEach - Executed before each test");
	}

	@AfterEach
	public void afterEachTest() {
		System.out.println("@AfterEach - Executed after each test");
	}

	@Test
	public void testPalindromeTrue() {
		System.out.println("Running testPalindromeTrue");
		assertTrue(StringUtils.isPalindrome("madam"));
	}

	@Test
	public void testPalindromeFalse() {
		System.out.println("Running testPalindromeFalse");
		assertTrue(!StringUtils.isPalindrome("world"));
	}
}
