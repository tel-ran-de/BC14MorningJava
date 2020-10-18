package day29.HW28;

public class String1Task16_18 {
    public static void main(String[] args) {
        /*Given a string, return a version without both the first
        and last char of the string. The string may be any length,
        including 0. */
        System.out.println(withoutEnd2("Hello")); //→"ell"
        System.out.println(withoutEnd2("abc")); //→"b"
        System.out.println(withoutEnd2("ab")); //→""

        System.out.println();
/* Given a string and an int n, return a string made of the first
and last n chars from the string. The string length will be at least n. */

        System.out.println(nTwice("Hello", 2)); //→ "Helo"
        System.out.println(nTwice("Chocolate", 3)); //→ "Choate"
        System.out.println(nTwice("Chocolate", 1)); //→ "Ce"

        System.out.println();

        // Given a string, return true if "bad" appears starting
        // at index 0 or 1 in the string, such as with "badxxx" or "xbadxx"
        // but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        System.out.println(hasBad("badxx")); //→ true
        System.out.println(hasBad("xbadxx")); //→ true
        System.out.println(hasBad("xxbadxx")); //→ false
    }

    private static boolean hasBad(String input) {
        if (input.substring(0,3).equals("bad")) {
            return true;
        } else {
            if (input.substring(1,4).equals("bad")) {
                return true;
            }
        }
        return false;
    }

    private static String nTwice(String text, int num) {
        String output = "";
        if (text.length() >= num) {
            output += text.substring(0, num) + text.substring(text.length()-num,
                    text.length());
        }
        return output;
    }

    private static String withoutEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }
}
