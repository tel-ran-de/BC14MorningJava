package day30;

import java.util.Arrays;

import static day06.Classwork2.split;

public class Homework30Anastasia {
    public static void main(String[] args) {
        char[] simbolsArray = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] newSimbolArray = copyArray(simbolsArray);
        sortSimbols(newSimbolArray);
        System.out.println(Arrays.toString(newSimbolArray));
        split();

        char[] alphabetArray = new char[]{'g', 'd', 'n', 'j', 'r', 'a', 'k', 'f', 'z'};
        char[] newAlphabetArray = copyArray(alphabetArray);
        sortAlphabet(newAlphabetArray);
        System.out.println(Arrays.toString(newAlphabetArray));

        char[] mixAlphabetArray = new char[]{'в', 'a', 'n', 'j', 'б', 'а', 'k', 'л', 'z', 'ё'};
        String etalon = "abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшъыьэюя";
        char[] newMixAlphabetArray = copyArray(mixAlphabetArray);
        sortMixAlphabet(newMixAlphabetArray, etalon);
        System.out.println(Arrays.toString(newMixAlphabetArray));
    }

    private static void sortMixAlphabet(char[] inputMix, String etalon) {
        int count = 0;
        for (int i = 0; i < inputMix.length - 1; i++) {
            int indexOne = etalon.indexOf(inputMix[i]);
            int indexTwo = etalon.indexOf(inputMix[i + 1]);
            if (indexOne > indexTwo) {
                char temp = inputMix[i];
                inputMix[i] = inputMix[i + 1];
                inputMix[i + 1] = temp;
                count++;
            }
            if (count > 0) {
                sortMixAlphabet(inputMix, etalon);
            }
        }
    }

    private static void sortAlphabet(char[] inputAlphabet) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < inputAlphabet.length - 1; i++) {
                if (inputAlphabet[i] > inputAlphabet[i + 1]) {
                    char temp = inputAlphabet[i];
                    inputAlphabet[i] = inputAlphabet[i + 1];
                    inputAlphabet[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    private static void sortSimbols(char[] inputSimbol) {
        int count = 0;
        for (int i = 0; i < inputSimbol.length - 1; i++) {
            if (inputSimbol[i] > inputSimbol[i + 1]) {
                char temp = inputSimbol[i];
                inputSimbol[i] = inputSimbol[i + 1];
                inputSimbol[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            sortSimbols(inputSimbol);
        }
    }

    private static char[] copyArray(char[] inputArray) {
        char[] outputArray = new char[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray = inputArray;
        }
        return outputArray;
    }
}
