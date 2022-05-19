package gxp.gery.codewars.answers.level7;

public class VowelCount {

    public static int countVowel(String str) {
        return str.replaceAll("(?i)[^aiueo]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(VowelCount.countVowel("aiueo")); //5
        System.out.println(VowelCount.countVowel("aiUeO")); //5
        System.out.println(VowelCount.countVowel("abracadabra")); //5
        System.out.println(VowelCount.countVowel("BUy 100 SaUsAge")); //5
    }
}
