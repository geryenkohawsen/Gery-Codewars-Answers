package gxp.gery.codewars.answers.level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatePinTest {

    @Test
    public void validPins() {
        assertTrue(ValidatePin.validatePin("1234"));
        assertTrue(ValidatePin.validatePin("0000"));
        assertTrue(ValidatePin.validatePin("1111"));
        assertTrue(ValidatePin.validatePin("123456"));
        assertTrue(ValidatePin.validatePin("098765"));
        assertTrue(ValidatePin.validatePin("000000"));
        assertTrue(ValidatePin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(ValidatePin.validatePin("a234"));
        assertFalse(ValidatePin.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(ValidatePin.validatePin("1"));
        assertFalse(ValidatePin.validatePin("12"));
        assertFalse(ValidatePin.validatePin("123"));
        assertFalse(ValidatePin.validatePin("12345"));
        assertFalse(ValidatePin.validatePin("1234567"));
        assertFalse(ValidatePin.validatePin("-1234"));
        assertFalse(ValidatePin.validatePin("1.234"));
        assertFalse(ValidatePin.validatePin("00000000"));
    }
}
