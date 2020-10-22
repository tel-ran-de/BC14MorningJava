package day30;

import java.util.Arrays;

public class BubbleSortNoRecursion {
    public static void main(String[] args) {
        int[] myArr = {3, 17, 5, 1, 98, 38, 15, 4};
        bubbleSort(myArr);
        System.out.print(Arrays.toString(myArr));
    }

    private static void bubbleSort(int[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
