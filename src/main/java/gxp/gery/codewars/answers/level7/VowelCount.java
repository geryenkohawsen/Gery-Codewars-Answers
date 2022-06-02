package gxp.gery.codewars.answers.level7;

public class VowelCount {

    public static int countVowel(String str) {
        return str.replaceAll("(?i)[^aiueo]", "").length();
    }
}
