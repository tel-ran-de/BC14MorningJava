package day28.Homework28;

import static day06.Classwork2.split;

public class StringAndArray03HW {
    public static void main(String[] args) {
        System.out.println("Count YZ " + countYZ("fez day")); // → 2
        System.out.println("Count YZ " + countYZ("day fez")); // → 2
        System.out.println("Count YZ " + countYZ("day fyyyz")); // → 2
        split();
        /*int[] arr1 = new int[]{1, 2, 1, 1, 3};
        int[] arr2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] arr3 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(arr1)); //4
        System.out.println(maxSpan(arr2)); //6
        System.out.println(maxSpan(arr3)); //6
    }

    private static int maxSpan(int[] arr1) {
        return 0;*/
    }

    private static int countYZ(String str) {
        int result = 0;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.endsWith("z") || word.endsWith("y")) {
                result++;
            }
        }
        return result;
    }
}
