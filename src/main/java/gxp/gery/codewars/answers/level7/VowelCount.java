package gxp.gery.codewars.answers.level7;

public class VowelCount {

    public static String countVowel(String str) {
        return String.valueOf(str.replaceAll("(?i)[^aiueo]", "").length());
    }
}
