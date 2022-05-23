package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {

    @Test
    public void testClock(){
        assertEquals(61000, Clock.Past(0,1,1));
        assertEquals(26028000, Clock.Past(7, 13, 48));
    }
}
