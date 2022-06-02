package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeUpperCaseTest {

    @Test
    public void testMakeUpperCase() {
        assertEquals("HELLO",MakeUpperCase.makeUpperCase("hello"));
        assertEquals("HELLO WORLD",MakeUpperCase.makeUpperCase("hello world"));
        assertEquals("HELLO WORLD !",MakeUpperCase.makeUpperCase("hello world !"));
        assertEquals("HELLO WORLD !",MakeUpperCase.makeUpperCase("heLlO wORLd !"));
        assertEquals("1,2,3 HELLO WORLD!",MakeUpperCase.makeUpperCase("1,2,3 hello world!"));
    }
}
