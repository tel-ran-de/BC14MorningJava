package day30.TestSorting;

import java.util.Arrays;

public class CoctailSwapInt {
    public static void main(String[] args) {
        int[] arr = getMeIntNumbers(8);
        System.out.println("original array: " + Arrays.toString(arr));
        int[] newArray = new int[arr.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        coctailSort(newArray);
        System.out.println("Copy array: " + Arrays.toString(newArray));
    }

    private static void coctailSort(int[] newArray) {
        int start = 0;
        int end = newArray.length - 1;
        int count = 0;
        for (int i = start; i < end; i++) {
            if (newArray[i] > newArray[i + 1]) {
                int temp = newArray[i];
                newArray[i] = newArray[i + 1];
                newArray[i + 1] = temp;
                count++;
            }
        }
        end--;
        for (int i = end; i > start; i--) {
            if (newArray[i] < newArray[i - 1]) {
                int temp = newArray[i];
                newArray[i] = newArray[i + 1];
                newArray[i + 1] = temp;
                count++;
            }
            start++;
            if (count == 0) {
                break;
            }
        }
    }
    private static int[] getMeIntNumbers(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
