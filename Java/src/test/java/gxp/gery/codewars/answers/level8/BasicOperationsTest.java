package gxp.gery.codewars.answers.level8;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicOperationsTest {

    @Test
    public void testRandomAddition() {
        for (int i = 0; i < 5; i++) {
            double random1 = Math.floor(Math.random() * 1005);
            double random2 = Math.floor(Math.random() * 1005);
            int value1 = (int) random1;
            int value2 = (int) random2;

            assertThat(BasicOperations.basicMath("+", value1, value2), is(value1 + value2));
        }
    }

    @Test
    public void testRandomSubtraction() {
        for (int i = 0; i < 5; i++) {
            double random1 = Math.floor(Math.random() * 1005);
            double random2 = Math.floor(Math.random() * 1005);
            int value1 = (int) random1;
            int value2 = (int) random2;

            assertThat(BasicOperations.basicMath("-", value1, value2), is(value1 - value2));
        }
    }

    @Test
    public void testRandomMultiplication() {
        for (int i = 0; i < 5; i++) {
            double random1 = Math.floor(Math.random() * 1005);
            double random2 = Math.floor(Math.random() * 1005);
            int value1 = (int) random1;
            int value2 = (int) random2;

            assertThat(BasicOperations.basicMath("*", value1, value2), is(value1 * value2));
        }
    }

    @Test
    public void testRandomDivision() {
        for (int i = 0; i < 5; i++) {
            double random1 = Math.floor(Math.random() * 1005);
            double random2 = Math.floor(Math.random() * 1005);
            int value1 = (int) random1;
            int value2 = (int) random2;

            assertThat(BasicOperations.basicMath("/", value1, value2), is(value1 / value2));
        }
    }
}
