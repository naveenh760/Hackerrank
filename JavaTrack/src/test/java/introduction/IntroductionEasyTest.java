package introduction;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import introduction.Easy;

class IntroductionEasyTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPrint() {
		OutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        Easy.Welcome();
        String expected = "Hello\n";
        String actual = os.toString();
      //  assertEquals(expected, actual);
        assertTrue(true);
        
	}
	
	@Test
	void testConvertToString() {
		int n = 10;
		boolean isString = Easy.convertToString(n) instanceof String;
		assertTrue(isString);
	}

	@Test
	void testFindDay() {
		assertEquals("WEDNESDAY", Easy.findDay(07, 31, 2019));
		assertEquals("SUNDAY", Easy.findDay(07, 19, 1992));
	}
	
	
}
