package day32;

import java.util.Arrays;

public class ReViewArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        //addToElementDigit(arr1, 5);
        System.out.println(Arrays.toString(arr1));
        int[] testY = addToElementDigitReturnType(arr1, 10);
        System.out.println(Arrays.toString(testY));
        System.out.println(Arrays.toString(arr1));
        System.out.println(testY);
        System.out.println(arr1);
        // 1. Мы сначала делаем копию
        // 2. Сортировка копии массива
    }

    private static void addToElementDigit(int[] arr, int digit) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += digit;
        }
    }

    private static int[] addToElementDigitReturnType(int[] arr, int digit) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += digit;
        }
        return arr;
    }
}
