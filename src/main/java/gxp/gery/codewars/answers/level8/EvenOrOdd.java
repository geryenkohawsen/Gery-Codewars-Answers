package gxp.gery.codewars.answers.level8;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 != 0 ? "Odd" : "Even";
    }

    public static void main(String[] args) {
        System.out.println(EvenOrOdd.even_or_odd(1));
        System.out.println(EvenOrOdd.even_or_odd(2));
        System.out.println(EvenOrOdd.even_or_odd(3));
        System.out.println(EvenOrOdd.even_or_odd(4));
    }
}
