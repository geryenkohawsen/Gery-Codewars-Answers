package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {

    @Test
    void basicTests() {
        assertEquals("Hello boss", Greet.greet("Gery", "Gery"));
        assertEquals("Hello guest", Greet.greet("Ikarashi", "Gery"));
        assertEquals("Hello guest", Greet.greet("Higashi", "Gery"));
    }
}
