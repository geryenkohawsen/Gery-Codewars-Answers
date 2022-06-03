package gxp.gery.codewars.answers.level8;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveTest {

    @Test
    public void testPositive() {
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    }
}
