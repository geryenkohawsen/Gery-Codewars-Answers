package gxp.gery.codewars.answers.level8;

public class Positive {

    public static int sum(int[] arr) {
        int result = 0;

        for (int j : arr) {
            result += Math.max(j, 0);
        }

        return result;
    }
}
