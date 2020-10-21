package day28.hw;

       /* String 01: File 13

        Task16:Given a string, return a version without both the first and last char of the string.
        The string may be any length, including 0.
        withoutEnd2("Hello") → "ell"
        withoutEnd2("abc") → "b"
        withoutEnd2("ab") → ""

        Task 17: Given a string and an int n, return a string made of the first and last n chars from the string.
        The string length will be at least n.
        nTwice("Hello", 2) → "Helo"
        nTwice("Chocolate", 3) → "Choate"
        nTwice("Chocolate", 1) → "Ce"

        String 02: File14:

        Task 15: Return true if the string “cat” and “dog” appear the same number of times in the given string.
        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true

        Task 16: Return true if the given string contains an appearance of “xyz”
        where the xyz is not directly preceeded by a period (.). So “xxyz” counts but “x.xyz” does not.
        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true

        Task 17: Given two strings, a and b, create a bigger string made of the first char of a,
        the first char of b, the second char of a, the second char of b, and so on.
        Any leftover chars go at the end of the result.
        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"*/

import static day06.Classwork2.split;

public class HomeWork28 {
    public static void main(String[] args) {
        split();
        System.out.println("/" + withoutEnd2("Hello") + "/");// → "ell"
        System.out.println("/" + withoutEnd2("abc") + "/");// → "b"
        System.out.println("/" + withoutEnd2("ab") + "/");// → ""
        split();
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        split();
        System.out.println(catDog("catdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true
        split();
        System.out.println(xyzThere("abcxyz"));// → true
        System.out.println(xyzThere("abc.xyz"));// → false
        System.out.println(xyzThere("xyz.abc"));// → true
        split();
        System.out.println(mixString("abc", "xyz"));// → "axbycz"
        System.out.println(mixString("Hi", "There"));// → "HTihere"
        System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"
        split();

    }

    private static String mixString(String str1, String str2) {
        String output = "";
        if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                output += str1.charAt(i) + "" + str2.charAt(i);
            }
            output += str1.substring(str2.length());
        }
        if (str1.length() < str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                output += str1.charAt(i) + "" + str2.charAt(i);
            }
            output += str2.substring(str1.length());
        }
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                output += str1.charAt(i) + "" + str2.charAt(i);
            }
        }
        return output;
    }

    private static boolean xyzThere(String str) {
        String wordToSearch = "xyz";
        int index = str.indexOf(wordToSearch);
        return (str.contains(wordToSearch) && (index == 0 || str.charAt(index - 1) != '.'));
    }

    private static boolean catDog(String input) {
        int count1 = 0;
        int count2 = 0;
        String wordToCount1 = "dog";
        String wordToCount2 = "cat";
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.contains(wordToCount1)) {
                count1++;
            }
        }
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.contains(wordToCount2)) {
                count2++;
            }
        }
        return count1 == count2;
    }

    private static String nTwice(String str, int key) {
        return str.substring(0, key) + str.substring(str.length() - key);
    }

    private static String withoutEnd2(String input) {
        return input.substring(1, input.length() - 1);
    }

}
