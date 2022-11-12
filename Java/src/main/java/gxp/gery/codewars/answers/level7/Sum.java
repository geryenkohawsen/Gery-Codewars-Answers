package gxp.gery.codewars.answers.level7;

public class Sum {

    public int GetSum(int a, int b) {
        int result = 0;

        if (a > b) {
            for (; b <= a; b++) {
                result += b;
            }
        } else if (a == b) {
            result = a;
        } else {
            for (; a <= b; a++) {
                result += a;
            }
        }

        return result;
    }
}
