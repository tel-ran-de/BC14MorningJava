package HW30;

import java.util.Arrays;

public class BubbleSortChar {
    public static void main(String[] args) {
        char[] arraySymbols = new char[]{'a', '#', 'r', '?', '$', 'n', '%','A','C'};
        System.out.println(Arrays.toString(arraySymbols));
        char[] newArraySymbols = copyArray(arraySymbols);
        bubbleSortChar(newArraySymbols);
        System.out.println(Arrays.toString(newArraySymbols));
    }

    private static char[] copyArray(char[] input) {
        char[] output = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    private static void bubbleSortChar(char[] unsortedArraySymbols) {
        int count = 0;
        for (int i = 0; i < unsortedArraySymbols.length - 1; i++) {
            if (Character.toLowerCase(unsortedArraySymbols[i]) <= Character.toLowerCase(unsortedArraySymbols[i + 1]))
                continue;
            char temp = unsortedArraySymbols[i];
            unsortedArraySymbols[i] = unsortedArraySymbols[i + 1];
            unsortedArraySymbols[i + 1] = temp;
            count++;
        }
        if (count > 0) bubbleSortChar(unsortedArraySymbols);
    }
}
