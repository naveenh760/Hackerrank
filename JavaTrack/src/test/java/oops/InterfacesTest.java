package oops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class InterfacesTest {

	@ParameterizedTest
	@CsvSource({"6,12","1,1","11,12"})
	void testDivisorSum(int input, int expected) {
		AdvancedArithmetic ar = new MyCalculator();
		assertEquals(expected, ar.divisor_sum(input));
		
	}

}
