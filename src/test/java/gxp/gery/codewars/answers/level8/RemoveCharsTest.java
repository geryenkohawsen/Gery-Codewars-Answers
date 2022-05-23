package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("eryenk", RemoveChars.remove("geryenko"));
        assertEquals("AWSE", RemoveChars.remove("HAWSEN"));
        assertEquals("hitespace", RemoveChars.remove("    whitespaces      "));
        assertEquals("test2", RemoveChars.remove("1test23"));
        assertEquals("$%&'()", RemoveChars.remove("#$%&'()~"));
        assertEquals("中さ", RemoveChars.remove("田中さん"));
        assertEquals("２", RemoveChars.remove("１２３"));
        assertEquals("ожете передат", RemoveChars.remove("можете передать"));
    }
}
