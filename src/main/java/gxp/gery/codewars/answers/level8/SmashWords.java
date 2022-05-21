package gxp.gery.codewars.answers.level8;

public class SmashWords {

    public static String smash(String... words) {
        StringBuilder result = new StringBuilder();

        for(String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(SmashWords.smash("Bilal", "Djaghout"));
        System.out.println(SmashWords.smash("Geryenko", "Hawsen"));
        System.out.println(SmashWords.smash("Tram", "Anh"));
    }
}
