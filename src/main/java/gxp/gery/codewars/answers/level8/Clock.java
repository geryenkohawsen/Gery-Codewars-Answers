package gxp.gery.codewars.answers.level8;

public class Clock {
    public static int Past(int h, int m, int s) {
        return (h * 3600 + m * 60 + s) * 1000;
    }

    public static void main(String[] args) {
        System.out.println(Clock.Past(1, 1, 1));
        System.out.println(Clock.Past(1, 30, 30));
        System.out.println(Clock.Past(7, 13, 48));
    }
}
