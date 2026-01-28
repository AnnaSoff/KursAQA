package aston.aqa;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class FactorialTest {
    @Test
    void factorialOfFiveShouldBe120() {
        int result = (int) Factorial.factorial(5);
        AssertJUnit.assertEquals(120, result);
    }
}