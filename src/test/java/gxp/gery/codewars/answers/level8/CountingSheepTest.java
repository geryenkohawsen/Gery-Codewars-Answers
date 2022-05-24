package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingSheepTest {

    @Test
    public void testCountingSheep() {
        assertEquals("", CountingSheep.countingSheep(0));
        assertEquals("1 sheep...", CountingSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CountingSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountingSheep.countingSheep(3));
    }
}
