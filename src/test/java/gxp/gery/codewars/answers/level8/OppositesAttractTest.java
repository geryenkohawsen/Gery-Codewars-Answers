package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OppositesAttractTest {

    @Test
    public void testOddAndEven() {
        assertTrue(OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertFalse(OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertFalse(OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertTrue(OppositesAttract.isLove(0, 1));
    }
}
