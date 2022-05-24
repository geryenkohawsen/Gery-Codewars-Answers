package gxp.gery.codewars.answers.level8;

public class CountingSheep {

    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();

        for(int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }

        return result.toString();
    }
}
