package aston.at;

import org.junit.jupiter.api.Test;

//import Lesson_7_junit_5.CompareNumbers;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberComparatorTest {

    @Test
    void firstNumberShouldBeGreaterThanSecond() {
        CompareNumbers comparator = new CompareNumbers();

        int result = comparator.add(4, 5);

        assertTrue(result > 0);
    }
}