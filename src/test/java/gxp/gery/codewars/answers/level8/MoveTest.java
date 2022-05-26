package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTest {

    @Test
    public void basicTests() {
        assertEquals(8, Move.move(0, 4));
        assertEquals(15, Move.move(3, 6));
        assertEquals(12, Move.move(2, 5));
    }
}
