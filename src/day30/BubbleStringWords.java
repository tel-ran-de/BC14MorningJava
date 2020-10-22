package day30;

import java.util.Arrays;

public class BubbleStringWords {
    public static void main(String[] args) {
        String name = "Andris";
        String[] array = name.split("", 0);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(String[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1].toLowerCase().compareTo(input[i].toLowerCase()) < 0) {
                String tempStr = input[i];
                input[i] = input[i + 1];
                input[i + 1] = tempStr;
                count++;
            }
            if (count > 0)
                bubbleSort(input);
        }
    }
}
