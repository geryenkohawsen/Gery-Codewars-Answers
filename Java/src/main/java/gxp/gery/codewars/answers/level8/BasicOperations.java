package gxp.gery.codewars.answers.level8;

public class BasicOperations {

    public static Integer basicMath(String op, int v1, int v2) {

        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }
}
