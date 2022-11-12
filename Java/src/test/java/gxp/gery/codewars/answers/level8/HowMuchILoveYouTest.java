package gxp.gery.codewars.answers.level8;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowMuchILoveYouTest {

    @Test
    public void testHowMuchILoveYou() {
        assertEquals(HowMuchILoveYou.howMuchILoveYou(1), "I love you");
        assertEquals(HowMuchILoveYou.howMuchILoveYou(2), "a little");
        assertEquals(HowMuchILoveYou.howMuchILoveYou(6), "not at all");
    }

    @Test
    public void testRandomValues() {
        Random rand = new Random();
        for (int k = 0; k < 50; k++) {
            int n = rand.nextInt(100) + 1;  //  1 had been a 0

            String solution = HowMuchILoveYou.howMuchILoveYou(n);
            System.out.println("Testing number = " + n + ", " + solution);
            assertEquals(HowMuchILoveYou.howMuchILoveYou(n), solution);
        }
    }
}
