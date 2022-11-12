package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(6));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(7));
        assertEquals("Even", EvenOrOdd.evenOrOdd(0));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(-1));
    }
}
