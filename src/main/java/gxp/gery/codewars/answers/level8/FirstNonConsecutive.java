package gxp.gery.codewars.answers.level8;

public class FirstNonConsecutive {

    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                return array[i + 1];
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8})); //6
        System.out.println(FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8})); //null
        System.out.println(FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11})); //6
        System.out.println(FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11})); //11
        System.out.println(FirstNonConsecutive.find(new int[]{-3, -2, 0, 1})); //-0
    }
}
