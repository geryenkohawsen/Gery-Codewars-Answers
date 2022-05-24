package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveExclamationMarksTest {

    @Test
    public void testRemoveExclamationMarks() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello!!!! !!!World!"));
        assertEquals("", RemoveExclamationMarks.removeExclamationMarks("!!!"));
    }
}
