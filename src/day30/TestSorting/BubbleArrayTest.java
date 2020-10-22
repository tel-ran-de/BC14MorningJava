package day30.TestSorting;

import java.util.Arrays;

public class BubbleArrayTest {
    public static void main(String[] args) {
        // solving the task with recurtion
        int[] arr = {17, 134, 58, 2, 9, 94, 112};
        findNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int lightBubble = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = lightBubble;
                count++;
            }
            if (count > 0) {
    findNumbers(arr);
            }
        }
    }
}
