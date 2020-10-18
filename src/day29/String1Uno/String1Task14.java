package day29.String1Uno;

public class String1Task14 {
    public static void main(String[] args) {
        /* Given a string, return a version without the first and last
         char, so "Hello" yields "ell". The string length will be at least 2.  */

        System.out.println(withoutEnd("Hello")); //→ "ell"
        System.out.println(withoutEnd("java")); //→ "av"
        System.out.println(withoutEnd("coding")); //→ "odin"

        System.out.println();

        /*Given a string, return a "rotated left 2" version where
        the first 2 chars are moved to the end. The string length will
         be at least 2. */

        System.out.println(left2("Hello")); //→"lloHe"
        System.out.println(left2("java")); //→"vaja"
        System.out.println(left2("Hi")); //→"Hi"
    }

    private static String left2(String input) {
        return input.substring(2) + input.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "error";
        }
    }
}
