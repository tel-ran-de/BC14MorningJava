package day32;

import day30.BubbleSortIntro;

public class Logic02_09 {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));// → true
        System.out.println(evenlySpaced(4, 6, 2));// → true
        System.out.println(evenlySpaced(4, 6, 3));// → false
    }

    private static boolean evenlySpaced(int a, int b, int c) {
        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(a - c);
        // not solved
        return diff1 == diff2 || diff1 / 2 == diff2 || diff2 / 2 == diff1;
    }

    private static boolean evenlySpacedSecond(int a, int b, int c) {
        int small, medium, large;
        int[] arr = new int[]{a, b, c};
        BubbleSortIntro.bubbleSort(arr);
        small = arr[0];
        medium = arr[1];
        large = arr[2];
        if (medium - small == large - medium) {
            return true;
        }
        return false;
        //return medium - small == large - medium;
    }
}
