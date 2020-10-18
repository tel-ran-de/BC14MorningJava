package day29.String1Uno;

public class String1Task8 {
    public static void main(String[] args) {
/* Given 2 strings, a and b, return a new string made of
the first char of a and the last char of b,
so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.   */

        System.out.println(lastChars("last", "chars")); //→"ls"
        System.out.println(lastChars("yo", "java")); //→"ya"
        System.out.println(lastChars("hi", "")); //→"h@"
    }

    private static String lastChars(String str1, String str2) {
        char sobaka = '@';
        if (str2.length() == 0) {
            return str1.substring(0, 1) + sobaka;
        } else {
            return str1.substring(0, 1) + str2.substring(str2.length() - 1);
        }
    }
}
