package day30_homwork_Olga;

import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        char[] myChar = new char[]{'@', 'a', '*', 'm', '$', 'b', '#', '<', 'c'};
        bubbleSortChar(myChar);
        char[] newArray = copyArray(myChar);
        System.out.println(Arrays.toString(newArray));
    }

    private static void bubbleSortChar(char[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                char temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortChar(input);
        }
    }

    private static char[] copyArray(char[] input) {
        char[] output = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

}