package datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dsEasyTest {

	@Test
	void testHourGlass() {
		int[][] matrix =   
		               { {1,1,1,0,0,0},
		            	 {0,1,0,0,0,0},	   
		            	 {1,1,1,0,0,0},
		            	 {0,0,0,0,0,0},
		            	 {0,0,0,0,0,0}  };
		assertEquals(7, dsEasy.hourGlass(matrix));
	}
	
	@Test
	void testSubArraySum() {
		int array[] = {1,-2,4,-5,1};
		assertEquals(9, dsEasy.subArraySum(array));
	}

}
