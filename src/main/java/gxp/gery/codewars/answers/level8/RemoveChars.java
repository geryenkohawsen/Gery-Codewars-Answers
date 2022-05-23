package gxp.gery.codewars.answers.level8;

public class RemoveChars {

    /**
     * remove the first and last character in a parameter, including: unicode characters (田中さん, можете передать),
     * lowercase letters (abc), uppercase letters (ABC), numeric character (123), and special characters (?!#$%&).
     * @param str
     */
    public static String remove(String str) {

        //remove whitespaces
        String removeWhiteSpace = str.trim();

        //remove first character
        String removeFirstChar = removeWhiteSpace.replaceAll("^\\p{L}|^\\p{N}|^\\W", "");

        //remove last character
        String removeLastChar = removeFirstChar.replaceAll("\\p{L}$|\\p{N}$|\\W$", "");

        //return removeLastChar as return value
        return removeLastChar;
    }
}

