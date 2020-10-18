package day28.Homework28;

import static day06.Classwork2.split;

public class String01HW {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello")); // → "ell"
        System.out.println(withoutEnd2("abc")); // → "b"
        System.out.println(withoutEnd2("ab")); // → ""
        split();
        System.out.println(nTwice("Hello", 2)); // → "Helo"
        System.out.println(nTwice("Chocolate", 3)); // → "Choate"
        System.out.println(nTwice("Chocolate", 1)); // → "Ce"
        System.out.println(nTwice("Hello", 5)); // → "Ce"
    }

    private static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    private static String withoutEnd2(String str) {
        if (str.length() < 1) {
            return "";
        }
        String output = str.substring(1, (str.length() - 1));
        return output;
    }
}
