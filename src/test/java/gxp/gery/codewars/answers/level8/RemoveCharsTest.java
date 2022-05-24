package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCharsTest {

    @Test
    public void removeChars() {
        assertEquals("eryenk", RemoveChars.remove("geryenko"));
        assertEquals("AWSE", RemoveChars.remove("HAWSEN"));
    }

    @Test
    public void removeWhitespaces() {
        assertEquals("hitespace", RemoveChars.remove("    whitespaces      "));
    }

    @Test
    public void removeNumbers() {
        assertEquals("23", RemoveChars.remove("1234"));
        assertEquals("２", RemoveChars.remove("１２３"));
    }

    @Test
    public void removeSpecialChars() {
        assertEquals("$%&'()", RemoveChars.remove("#$%&'()~"));
    }

    @Test
    public void removeDifferentLanguages() {
        assertEquals("中さ", RemoveChars.remove("田中さん"));
        assertEquals("ожете передат", RemoveChars.remove("можете передать"));
    }
}
