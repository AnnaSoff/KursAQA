package aston.aqa;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TriangleAreaTest {
    @Test
    void areaOfTriangleShouldBeCorrect() {
       // TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        double result = TriangleAreaCalculator.calculateTriangleArea(10, 5);
        assertEquals(25.0, result);
    }
}