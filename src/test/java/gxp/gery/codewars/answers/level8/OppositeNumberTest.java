package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeNumberTest {

    @Test
    public void testOpposite() {
        assertEquals(-1, OppositeNumber.opposite(1));
        assertEquals(0, OppositeNumber.opposite(0));
        assertEquals(25, OppositeNumber.opposite(-25));
    }
}
