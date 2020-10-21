package Homework;

import day20.FillAndPrintIntArray;

public class HomeWorkArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 1, 3};
        int[] arr1 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] arr2 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(arr));// → 4
        System.out.println(maxSpan(arr1));// → 6
        System.out.println(maxSpan(arr2));// → 6
    }

    private static int maxSpan(int[] input) {
        int result = 0;
        int max = 0;
        int min = 0;
        int countMax = 0;
        int countMin = 0;
        for (int i = 0; i <input.length ; i++) {
            max = Math.max(input[i], max);
            countMax++;

        }
        for (int i = 0; i <input.length ; i++) {
            min = Math.min(input[i],min);
            countMin++;

        }
        return countMax + countMin;

    }
}
