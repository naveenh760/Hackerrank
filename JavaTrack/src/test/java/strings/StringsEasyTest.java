package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import strings.StringsEasy;

class StringsEasyTest {

	@Test
	void testGetSmallestAndLargest() {
		String input = "welcometojava";
		String expected = "ava\nwel";
		String actual = StringsEasy.getSmallestAndLargest(input, 3);
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"asa", "racecar","radar"})
	void testIsPalindrome_true(String candidate) {
		assertTrue(StringsEasy.isPalindrome(candidate));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Naveen", "Asa","HaH1"})
	void testIsPalindrome_false(String candidate) {
		assertFalse(StringsEasy.isPalindrome(candidate));
	}
	
	@ParameterizedTest
	@CsvSource({ "cat,act", "anagram,margana", })
	void testIsAnagram_true(String a, String b) {
		assertTrue(StringsEasy.isAnagram(a,b));
	}
	
	@ParameterizedTest
	@CsvSource({"anagram,marganaa"})
	void testIsAnagram_false(String a, String b) {
		assertFalse(StringsEasy.isAnagram(a, b));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Samantha", "Samantha21","JuliaZ007"})
	void testIsValidUserName_true(String username) {
		assertTrue(StringsEasy.isValidUserName(username));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Julia","_Julia","1Samantha"})
	void testIsValidUserName_false(String username) {
		assertFalse(StringsEasy.isValidUserName(username));
	}
}
