package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCharsTest {

    @Test
    public void testRemoveChars() {
        assertEquals("eryenk", RemoveChars.remove("geryenko"));
        assertEquals("AWSE", RemoveChars.remove("HAWSEN"));
    }

    @Test
    public void testRemoveWhitespaces() {
        assertEquals("hitespace", RemoveChars.remove("    whitespaces      "));
    }

    @Test
    public void testRemoveNumbers() {
        assertEquals("23", RemoveChars.remove("1234"));
        assertEquals("２", RemoveChars.remove("１２３"));
    }

    @Test
    public void testRemoveSpecialChars() {
        assertEquals("$%&'()", RemoveChars.remove("#$%&'()~"));
    }

    @Test
    public void testRemoveDifferentLanguages() {
        assertEquals("中さ", RemoveChars.remove("田中さん"));
        assertEquals("ожете передат", RemoveChars.remove("можете передать"));
    }
}
