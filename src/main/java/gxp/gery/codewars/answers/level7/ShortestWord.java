package gxp.gery.codewars.answers.level7;

public class ShortestWord {

    public static int findShort(String s) {

        String[] words = s.split(" ");

        String smallest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }
        return smallest.length();
    }
}
