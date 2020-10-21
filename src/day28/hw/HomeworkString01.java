package day28.hw;

import static day06.Classwork2.split;

public class HomeworkString01 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""
        split();
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        split();

    }

    private static String nTwice(String s1, int n) {
        return s1.substring(0, n) + s1.substring(s1.length() - n);

    }

    private static String withoutEnd2(String s1) {
        return s1.substring(1, s1.length() - 1);
    }

}
