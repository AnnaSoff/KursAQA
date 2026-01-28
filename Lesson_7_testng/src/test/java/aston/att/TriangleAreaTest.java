package aston.att;

import org.testng.annotations.Test;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;


public class TriangleAreaTest {
    @Test
    void testValidTriangle() {
        assertEquals(6.0, TriangleAreaCalculator.area(3, 4, 5), 0.001);
    }

    @Test
    void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(1, 2, 5));
    }

    @Test
    void testNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(-1, 2, 2));
    }
}