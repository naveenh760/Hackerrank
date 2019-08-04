package strings;

import static org.junit.jupiter.api.Assertions.*;
import strings.StringsMedium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringsMediumTest {

	@ParameterizedTest
	@CsvSource  ({"Goodbye bye bye world world world,Goodbye bye world","Hello hello Ab aB,Hello Ab",
		"in inthe,in inthe"})
	void testRemoveDuplicateWords(String input, String expected) {
	    assertEquals(expected, StringsMedium.removeDuplicateWords(input));
	}
	
	@ParameterizedTest
	@ValueSource (strings = {"000.12.12.034","121.234.12.12","23.45.12.56","192.168.111.222"})
	void testIsIPAddress_true(String input) {
		assertTrue(StringsMedium.isIPAddress(input));
	}
	
	@ParameterizedTest
	@ValueSource (strings = {"000.12.234.23.23","666.666.23.23",".213.123.23.32","23.45.22.32.","I.Am.not.an.ip"})
	void testIsIPAddress_false(String input) {
		assertFalse(StringsMedium.isIPAddress(input));
	}

}
