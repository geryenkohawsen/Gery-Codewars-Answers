package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    void testMultiply() {
        assertEquals(1, Multiply.multiply(1.0, 1.0));
        assertEquals(4, Multiply.multiply(2.0, 2.0));
        assertEquals(4, Multiply.multiply(1.0, 4.0));
        assertEquals(4, Multiply.multiply(-2.0, -2.0));
        assertEquals(94.39691643, Multiply.multiply(7.123, 13.25241));
    }
}
