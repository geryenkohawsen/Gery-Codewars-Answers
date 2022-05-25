package gxp.gery.codewars.answers.level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    Sum s = new Sum();

    @Test
    public void TestPositive() {
        assertEquals(14, s.GetSum(5, -1));
        assertEquals(127759, s.GetSum(505, 4));
        assertEquals(44178, s.GetSum(321, 123));
    }

    @Test
    public void TestNegative() {
        assertEquals(-1275, s.GetSum(-50, 0));
        assertEquals(-15, s.GetSum(-1, -5));
        assertEquals(-5, s.GetSum(-5, -5));
        assertEquals(-127755, s.GetSum(-505, 4));
        assertEquals(-44055, s.GetSum(-321, 123));
    }

    @Test
    public void TestZero() {
        assertEquals(0, s.GetSum(0, 0));
    }

    @Test
    public void TestSwitchMinMax() {
        assertEquals(-15, s.GetSum(-5, -1));
        assertEquals(15, s.GetSum(5, 1));
    }

    @Test
    public void TestEqual() {
        assertEquals(-17, s.GetSum(-17, -17));
        assertEquals(17, s.GetSum(17, 17));
    }
}
