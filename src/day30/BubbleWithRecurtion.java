package day30;

import java.util.Arrays;

public class BubbleWithRecurtion {
    public static void main(String[] args) {
        int[] myArr = {104, 64, 34, 25, 12, 22, 11, 90};
        bubbleSort(myArr);
        System.out.print(Arrays.toString(myArr));
    }

    private static void bubbleSort(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                int lightBubble = number[i];
                number[i] = number[i + 1];
                number[i + 1] = lightBubble;
                count++;
            }
            if (count > 0) {
                bubbleSort(number);
            }
        }
    }
}
