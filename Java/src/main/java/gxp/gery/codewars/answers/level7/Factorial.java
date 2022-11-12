package gxp.gery.codewars.answers.level7;

public class Factorial {

    public static int factorial(int n) throws IllegalArgumentException {
        int result = 1; //n = 0

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }

        for (int i = n; i > 0; i--) {
            result = result * i;
        }

        return result;
    }
}