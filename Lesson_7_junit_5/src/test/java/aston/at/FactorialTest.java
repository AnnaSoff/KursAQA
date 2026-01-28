package aston.at;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void factorialOfFiveShouldBe120() {
        Factorial factorial = new Factorial();

        int result = (int) Factorial.factorial(5);

        assertEquals(120, result);
    }
}