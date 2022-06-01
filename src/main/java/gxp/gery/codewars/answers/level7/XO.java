package gxp.gery.codewars.answers.level7;

public class XO {

    public static boolean getXO (String str) {
        int xTotal = str.replaceAll("(?i)[^x]", "").length();
        int oTotal = str.replaceAll("(?i)[^o]", "").length();

        return xTotal == oTotal;
    }
}
