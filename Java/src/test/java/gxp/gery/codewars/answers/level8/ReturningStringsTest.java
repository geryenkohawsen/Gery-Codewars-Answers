package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturningStringsTest {

    public static String testGreet()
    {
        int min = 10;
        int max = 50;
        int len = (int)Math.floor(Math.random()*(max-min+1)+min);
        StringBuilder str = new StringBuilder();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < len; i++) {
            int r = (int)(Math.random() * alpha.length());
            char ch = alpha.charAt(r);
            str.append(ch);
        }
        return str.toString();
    }

    @Test
    public void testSomething()
    {
        String rand = testGreet();
        String exp = "Hello, "+rand+" how are you doing today?";
        assertEquals(exp, ReturningStrings.greet(rand));
    }
}
