package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedStringsTest {

    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.reverseStrings("world"));
        assertEquals("hi", ReversedStrings.reverseStrings("ih"));
        assertEquals("321", ReversedStrings.reverseStrings("123"));
    }
}
