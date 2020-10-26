package day30.hw;

import java.util.Arrays;

import static day06.Classwork2.split;

public class HomeworkSort {
    public static void main(String[] args) {
        char[] symbolsArray = new char[]{'!', '(', '=', '#', '<', '%', '?', 'b', 'a'};
        System.out.println(Arrays.toString(symbolsArray));
        char[] newArray = copyArray(symbolsArray);
        bubbleSort(newArray);
        System.out.println(Arrays.toString(newArray));
        split();
        char[] letters = new char[]{'g', 'k', 'u', 'o', 't', 'm', 'q', 'r'};
        System.out.println(Arrays.toString(letters));
        char[] sortLetters = copyArray(letters);
        bubbleSortLetters(sortLetters);
        System.out.println(Arrays.toString(sortLetters));

    }

    private static void bubbleSortLetters(char[] letters) {
        int count = 0;
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] > letters[i + 1]) {
                char temp = letters[i];
                letters[i] = letters[i + 1];
                letters[i + 1] = temp;
                count++;
            }
            if (count > 0) {
                bubbleSortLetters(letters);
            }

        }
    }

    private static void bubbleSort(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
            if (count > 0) {
                bubbleSort(arr);
            }

        }
    }

    private static char[] copyArray(char[] arr) {
        char[] output = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        return output;
    }
}
