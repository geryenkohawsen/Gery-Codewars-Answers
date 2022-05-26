package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NumberToStringTest {

    @Test
    public void basicTests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("79585", NumberToString.numberToString(79585));
        assertNotEquals(79585, NumberToString.numberToString(79585));
        assertEquals("3", NumberToString.numberToString(1+2));
        assertEquals("-1", NumberToString.numberToString(1-2));
    }
}
