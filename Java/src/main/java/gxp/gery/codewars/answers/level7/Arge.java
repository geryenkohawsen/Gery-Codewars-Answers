package gxp.gery.codewars.answers.level7;

public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int nYear = 0;
        double actualPercent = percent / 100;

        for(int i = 1; p0 < p; i++) {
            p0 = (int) (p0 + ((p0 * actualPercent) + aug));
            nYear = i;
        }

        return nYear;
    }
}
