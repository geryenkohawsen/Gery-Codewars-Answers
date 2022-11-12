package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
        assertEquals("Geryenko hawsen", SmashWords.smash("Geryenko", "Hawsen"));
        assertEquals("Tram Anh", SmashWords.smash("Tram", "Anh"));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash());
    }

    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash("Bilal"));
        assertEquals("Gery", SmashWords.smash("Gery"));
    }

}
