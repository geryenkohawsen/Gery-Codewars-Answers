package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrassHopperTest {

    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock", GrassHopper.sayHello("Mr. Spock"));
    }

    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk", GrassHopper.sayHello("Captain Kirk"));
    }

    @Test
    public void test3() {
        assertEquals("Hello, Lieutenant Uhura", GrassHopper.sayHello("Lieutenant Uhura"));
    }

    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy", GrassHopper.sayHello("Dr. McCoy"));
    }
}
