package gxp.gery.codewars.answers.level8;

public class Greet {

    public static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
