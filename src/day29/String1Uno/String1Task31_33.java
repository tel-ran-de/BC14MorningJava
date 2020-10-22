package day29.String1Uno;

public class String1Task31_33 {
    public static void main(String[] args) {

        System.out.println(minCat("Hello", "Hi")); // → "loHi"
        System.out.println(minCat("Hello", "java")); // → "ellojava"
        System.out.println(minCat("java", "Hello")); // → "javaello"

        System.out.println();

        /* Given a string, return a version without the first 2 chars.
        Except keep the first char if it is 'a' and keep the second char if it is 'b'.
        The string may be any length. Harder than it looks. */
        System.out.println(deFront("Hello")); //→ "llo"
        System.out.println(deFront("java")); //→ "va"
        System.out.println(deFront("away")); //→ "aay"

        System.out.println();

        /* Given a string, if one or both of the first 2 chars is 'x',
        return the string without those 'x' chars, and otherwise return the string unchanged.
        This is a little harder than it looks.  */

        System.out.println(withoutX2("xHi")); //→"Hi"
        System.out.println(withoutX2("Hxi")); //→"Hi"
        System.out.println(withoutX2("Hi")); //→"Hi"
    }

    private static String withoutX2(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'x') {
                output = str.substring(1);
            } else if (i == 1 && str.charAt(i) != 'x') {
                output = str.substring(0, 1) + str.substring(2);
            } else if (str.charAt(0)== 'x' && str.charAt(1) == 'x') {
                output = output + str.substring(2);
            }
        }
        return output;
    }

    private static String deFront(String str) {
        String output = "";
        if (str.length() >= 2 && str.charAt(0) == 'a') {
            output = output + str.charAt(0) + str.substring(str.length() - 2);
        } else if (str.charAt(1) == 'b') {
            output = output + str.charAt(1) + str.substring(str.length() - 2);
        } else if (str.length() < 2 && (str.charAt(0) != 'a' || str.charAt(1) != 'b')) {
            output = output;
        } else {
            output = output + str.substring(str.length() - 2);
        }

        return output;
    }

    private static String minCat(String a, String b) {
        String output = "";
        if (b.length() < a.length()) {
            output = output + a.substring(a.length() - b.length()) + b;
        } else {
            output = output + b.substring(b.length() - a.length()) + a;
        }
        return output;
    }
}
