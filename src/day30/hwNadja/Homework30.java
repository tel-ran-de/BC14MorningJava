package day30.hwNadja;

import java.util.Arrays;

public class Homework30 {
    public static void main(String[] args) {
        char[] arrChar = new char[]{'a', '3', 'h', '§', 'd', '7', 'q'};
        sortChar(arrChar);
        char[] arrAlfabet = new char[]{'C', 'd', 'a', 'b', 'h', 'm', 'e', 'F', 'g'};
        System.out.println("Сортировка по алфавиту учитывая регистр букв(по коду символа)");
        sortChar(arrAlfabet);
        System.out.println("Сортировка по алфавиту не учитывая регистр букв");
        sortAlfabet(arrAlfabet);
    }

    private static void sortAlfabet(char[] arrayChar) {
        char[] array = copyChar(arrayChar);
        char element1,element2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                element1=array[i];
                element2=array[j];
                if (Character.isLowerCase(array[i]) ) {
                    String letter1 = String.valueOf(array[i]);
                    letter1 = letter1.toUpperCase();
                    element1=letter1.charAt(0);
                }
                if (Character.isLowerCase(array[j]) ) {
                    String letter2 = String.valueOf(array[j]);
                    letter2 = letter2.toUpperCase();
                    element2=letter2.charAt(0);
                }
                if (element1 > element2) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void sortChar(char[] arrayChar) {
        char[] array = copyChar(arrayChar);
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static char[] copyChar(char[] arrayChar) {
        char[] outputChar = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            outputChar[i] = arrayChar[i];
        }
        return outputChar;
    }
}
