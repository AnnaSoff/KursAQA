package aston.at;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticTest {
    @Test
    void testAdd() {
        assertEquals(3, ArifmeticOperations.add(1, 2));
        assertEquals(-13, ArifmeticOperations.add(-5, -8));
        assertEquals(0, ArifmeticOperations.add(0, 0));
    }
    
    @Test
    void testSubtract() {
        assertEquals(-1, ArifmeticOperations.subtract(1, 2));
        assertEquals(0, ArifmeticOperations.subtract(0, 0));
        assertEquals(400, ArifmeticOperations.subtract(500, 100));
    }

    @Test
    void testMultiply() {
        assertEquals(2, ArifmeticOperations.multiply(1, 2));
        assertEquals(0, ArifmeticOperations.multiply(0, 0));
        assertEquals(500, ArifmeticOperations.multiply(5, 100));
    }

    @Test
    void testDivide() {
        assertEquals(0.5, ArifmeticOperations.divide(1, 2), 0.001);
        assertEquals(5, ArifmeticOperations.divide(10, 2), 0.001);
        assertEquals(1, ArifmeticOperations.divide(1, 1), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ArifmeticOperations.divide(1, 0));
    }
}