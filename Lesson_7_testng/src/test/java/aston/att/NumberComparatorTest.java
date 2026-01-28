package aston.att;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class NumberComparatorTest {
    @Test
    void testCompare() {
        assertEquals(1, CompareNumbers.compare(40, 3));
        assertEquals(-1, CompareNumbers.compare(22, 700));
        assertEquals(0, CompareNumbers.compare(1, 1));
    }
}
    
