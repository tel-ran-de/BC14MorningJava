package day30.hw;

      /*  1.Дан массив символов.Отсортировать их по порядку.
        2.***Дан массив букв.Отсортировать их по алфавиту.*/

import java.util.Arrays;

import static day06.Classwork2.split;

public class HomeWork30 {
    public static void main(String[] args) {
        split();
        char[] charArray = new char[]{'&', '+', '-', ' ', '='};
        System.out.println(Arrays.toString(charArray));
        sortCharArray(charArray);
        char[] newCharArray = copyArray(charArray);
        System.out.println(Arrays.toString(newCharArray));
        split();
        char[] letterArray = new char[]{'P', 'A', 'm', 'a', 'G', 'I', 't', 'e'};
        System.out.println(Arrays.toString(letterArray));
        sortLetters(letterArray);
        char[] newLetterArray = copyArray(letterArray);
        System.out.println(Arrays.toString(newLetterArray));
        split();
    }

    private static void sortLetters(char[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }

    }

    private static char[] copyArray(char[] input) {
        char[] output = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    private static void sortCharArray(char[] inputUnsort) {
        int count = 0;
        for (int i = 0; i < inputUnsort.length - 1; i++) {
            if (inputUnsort[i] <= inputUnsort[i + 1]) {
                continue;
            }
            char temp = inputUnsort[i];
            inputUnsort[i] = inputUnsort[i + 1];
            inputUnsort[i + 1] = temp;
            count++;
        }
        if (count > 0) {
            sortCharArray(inputUnsort);
        }
    }
}
