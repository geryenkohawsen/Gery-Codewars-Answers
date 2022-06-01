package gxp.gery.codewars.answers.level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {
    
    @Test
    public void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));

        assertEquals(3, ShortestWord.findShort("lets talk about Java the best language"));
        assertEquals(1, ShortestWord.findShort("i want to travel the world writing code one day"));
        assertEquals(2, ShortestWord.findShort("Lets all go on holiday somewhere very cold"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
    }
}
