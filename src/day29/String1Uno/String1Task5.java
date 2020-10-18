package day29.String1Uno;

public class String1Task5 {
    public static void main(String[] args) {
/* Given a string, return a string length 1 from its front,
unless front is false, in which case return a string
length 1 from its back. The string will be non-empty.
 */
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    private static String theEnd(String a, boolean statement) {
        String output = "";
        if (statement) {
            return a.substring(0, 1);
        } else {
            return a.substring(a.length() - 1);
        }
    }
}
