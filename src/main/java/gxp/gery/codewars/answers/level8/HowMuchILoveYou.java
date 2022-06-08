package gxp.gery.codewars.answers.level8;

public class HowMuchILoveYou {

    public static String howMuchILoveYou(int nb_petals) {
        String result;

        int response = nb_petals % 6;

        if (response == 1) {
            result = "I love you";
        } else if (response == 2) {
            result = "a little";
        } else if (response == 3) {
            result = "a lot";
        } else if (response == 4) {
            result = "passionately";
        } else if (response == 5) {
            result = "madly";
        } else {
            result = "not at all";
        }

        return result;
    }
}
