package day30.TestSorting;

import java.util.Arrays;

public class IntBubbleSort {
    public static void main(String[] args) {
        int[] arr = createArray(10);
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] newArr = Arrays.copyOf(arr, arr.length);
        sortNumbers(newArr);
        System.out.println("Sorted array: " + Arrays.toString(newArr));
    }

    private static void sortNumbers(int[] newArr) {
        int count = 0;
        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] > newArr[i + 1]) {
                int temp = newArr[i];
                newArr[i] = newArr[i + 1];
                newArr[i + 1] = temp;
                count++;
            }
            if (count > 0) {
                sortNumbers(newArr);
            }
        }
    }

    private static int[] createArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
