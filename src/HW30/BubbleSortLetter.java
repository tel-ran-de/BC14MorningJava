package HW30;

import java.util.Arrays;

public class BubbleSortLetter {
    public static void main(String[] args) {
        char[] lettersArray = new char[]{'Z', 'z', 'A', 'b', 'k', 'Y', 'L', 'c'};
        System.out.println(Arrays.toString(lettersArray));
        char[] newLettersArray = copyArray(lettersArray);
        bubbleSortLetter(newLettersArray);
        System.out.println(Arrays.toString(newLettersArray));
    }

    private static void bubbleSortLetter(char[] unsortedLettersArray) {
        int count = 0;
        for (int i = 0; i < unsortedLettersArray.length - 1; i++) {
            if (Character.toLowerCase(unsortedLettersArray[i]) <= Character.toLowerCase(unsortedLettersArray[i + 1]))
                continue;
            char temp = unsortedLettersArray[i];
            unsortedLettersArray[i] = unsortedLettersArray[i + 1];
            unsortedLettersArray[i + 1] = temp;
            count++;
        }
        if (count > 0) bubbleSortLetter(unsortedLettersArray);
    }

    private static char[] copyArray(char[] input) {
        char[] output = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }
}
